package com.stats.aggregator.scheduler.repo

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.stats.aggregator.DTOs.FilterQuery
import com.stats.aggregator.DTOs.enums.AggregationType
import com.stats.aggregator.scheduler.repo.contract.TStatsRepository
import com.sun.beans.decoder.ValueObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.mapreduce.{MapReduceOptions, MapReduceResults}
import org.springframework.data.mongodb.core.query.{Criteria, Query, Update}
import org.springframework.stereotype.Repository

/**
  * Handles all actions on statistic data
  */
@Repository class StatsRepository @Autowired()(mongoTemplate: MongoTemplate) extends TStatsRepository{

  // implicit casting String <-> BigDecimal
  private implicit def stringToBigDecimal(value: String) : BigDecimal = BigDecimal(value)
  private implicit def bigDecimalToString(value: BigDecimal) : String = value.bigDecimal.toPlainString


  /**
    * Saves stats values to passed object
    *
    * @param hourId Aggregation id of hour; Format: 'yyyyMMddHH'
    * @param min    minimal price value to save
    * @param max    maximal price value to save
    * @param avg    average price value to save
    * @param median median price value to save
    */
  override def saveHourStats(queryId: String, hourId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null): Unit = {
    if (hourId.length != 10) return

    val dayId = hourId.substring(0, 8).toShortExact.toString
    val hourNumber = hourId.substring(8, 10).toShortExact.toString
    val update = new Update
    update.set(s"daysStats.$$.hours.$hourNumber.min", min.bigDecimal.toString)
    update.set(s"daysStats.$$.hours.$hourNumber.max", max.bigDecimal.toString)
    update.set(s"daysStats.$$.hours.$hourNumber.avg", avg.bigDecimal.toPlainString)
    if (median != null) {
      update.set(s"daysStats.$$.hours.$hourNumber.median", median.bigDecimal.toString)
    }

    mongoTemplate.updateFirst(
      Query.query(Criteria.where("id").is(queryId).and("daysStats.aggId").is(dayId)),
      update,
      classOf[FilterQuery]
    )
  }

  /**
    * Saves stats values to passed object
    *
    * @param dayId  Aggregation id of the day; Format: 'yyyyMMdd'
    * @param min    minimal price value to save
    * @param max    maximal price value to save
    * @param avg    average price value to save
    * @param median median price value to save
    */
  override def saveDayStats(queryId: String, dayId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null): Unit = {
    if (dayId.length != 8) return

    val update = new Update
    update.set("daysStats.$.min", min.bigDecimal)
    update.set("daysStats.$.max", max.bigDecimal)
    update.set("daysStats.$.avg", avg.bigDecimal)
    if (median != null) {
      update.set("daysStats.$.median", median.bigDecimal)
    }

    mongoTemplate.updateFirst(
      Query.query(Criteria.where("id").is(queryId).and("daysStats.aggId").is(dayId)),
      update,
      classOf[FilterQuery]
    )
  }

  /**
    * Saves stats values to passed object
    *
    * @param monthId Aggregation id of the month; Format: 'yyyyMM'
    * @param min     minimal price value to save
    * @param max     maximal price value to save
    * @param avg     average price value to save
    * @param median  median price value to save
    */
  override def saveMonthStats(queryId: String, monthId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null): Unit = {
    if (monthId.length != 6) return

    val update = new Update
    update.set("monthsStats.$.min", min.bigDecimal)
    update.set("monthsStats.$.max", max.bigDecimal)
    update.set("monthsStats.$.avg", avg.bigDecimal)
    if (median != null) {
      update.set("monthsStats.$.median", median.bigDecimal)
    }

    mongoTemplate.updateFirst(
      Query.query(Criteria.where("id").is(queryId).and("monthsStats.aggId").is(monthId)),
      update,
      classOf[FilterQuery]
    )
  }

  /**
    * Saves stats values to passed object
    *
    * @param yearId Aggregation id of the year; Format: 'yyyy'
    * @param min    minimal price value to save
    * @param max    maximal price value to save
    * @param avg    average price value to save
    * @param median median price value to save
    */
  override def saveYearStats(queryId: String, yearId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null): Unit = {
    if (yearId.length != 6) return

    val update = new Update
    update.set("yearsStats.$.min", min.bigDecimal)
    update.set("yearsStats.$.max", max.bigDecimal)
    update.set("yearsStats.$.avg", avg.bigDecimal)
    if (median != null) {
      update.set("yearsStats.$.median", median.bigDecimal)
    }

    mongoTemplate.updateFirst(
      Query.query(Criteria.where("id").is(queryId).and("yearsStats.aggId").is(yearId)),
      update,
      classOf[FilterQuery]
    )
  }


  /**
    * Aggregate and calculate stats for passed day
    * @param queryId filter query with data to calculate
    * @param dayId day for which stats should be calculated (default today)
    */
  def calculateDayStats(queryId: String, dayId: String = null): Unit = {
    val currDayId = if (dayId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMMdd")) else dayId
    if (currDayId.length != 8) throw new IllegalArgumentException

    val query : Query = new Query(Criteria.where("_id").is(queryId).and("daysStats.aggId").is(currDayId))
    query.fields.include("daysStats.$.hours")

    val result = this.mapReduce(query, AggregationType.DAY)


    this.saveDayStats(queryId, currDayId, result.min, result.max, result.avg, result.median)
  }

  /**
    * Wraps standard mapReduce method with some default values for stats aggregating
    * @param query query to filter input data
    * @param aggregationType type of the aggregation to calculate, day
    * @return calculated stats
    */
  private def mapReduce(query: Query, aggregationType: AggregationType) : CalculatedStatsContainer = {
    val containerName = aggregationType match {
      case AggregationType.DAY => "daysStats"
      case AggregationType.MONTH => "monthsStats"
      case AggregationType.YEAR => "yearsStats"
    }

    val valueResults: MapReduceResults[ValueObject] = mongoTemplate.mapReduce(query, "filter_queries", "classpath:statsMapper.js", "classpath:statsReducer.js",
      MapReduceOptions.options().outputCollection(containerName + "_out"), classOf[ValueObject])

    val itr = valueResults.iterator
    while (itr.hasNext){
      val debug = itr.next.getValue

//      val valuesList = (parse(result.body) \\ "result").children  // List[JString]
//      if (valuesList.nonEmpty){
//        return valuesList.head.extract[List[String]].map(x => BigDecimal(x))
    }

    CalculatedStatsContainer("1", "2", "3", "4")
  }

  private case class CalculatedStatsContainer(min: String, max : String, avg : String, median : String)
}
