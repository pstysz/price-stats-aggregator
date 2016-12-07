package com.stats.aggregator.scheduler.repo

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.stats.aggregator.DTOs.FilterQuery
import com.stats.aggregator.scheduler.repo.contract.{CalculatedStatsContainer, TStatsRepository, ValueObject}
import net.liftweb.json._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.mapreduce.{MapReduceOptions, MapReduceResults}
import org.springframework.data.mongodb.core.query.{Criteria, Query, Update}
import org.springframework.stereotype.Repository

import scala.language.implicitConversions

/**
  * Handles all actions on statistic data
  */
@Repository class StatsRepository @Autowired()(mongoTemplate: MongoTemplate) extends TStatsRepository{

  // implicit casting
  implicit val formats = DefaultFormats
  private implicit def bigDecimalToString(value: BigDecimal) : String = value.bigDecimal.toPlainString
  private implicit def parseResultToStatsContainer(valueResults: MapReduceResults[ValueObject]) : CalculatedStatsContainer =
    if(valueResults.iterator.hasNext) parse(valueResults.iterator.next.value).extract[CalculatedStatsContainer] else null

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

    val dayId = hourId.substring(0, 8).toInt.toString
    val hourNumber = hourId.substring(8, 10).toInt.toString
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
    if (yearId.length != 4) return

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

    val dayToCalcId = if (dayId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMMdd")) else dayId
    if (dayToCalcId.length != 8) throw new IllegalArgumentException

    val params : java.util.Map[String, Object] =  new java.util.HashMap[String, Object]()
    params.put("aggId", dayToCalcId)

    val result = mongoTemplate.mapReduce(
      Query.query(Criteria.where("_id").is(queryId)), //.and("daysStats.aggId").is(dayToCalcId)),
      "filter_queries",
      "classpath:dayStatsMapper.js",
      "classpath:statsReducer.js",
      MapReduceOptions.options().scopeVariables(params).outputCollection("daysStats_out"),
      classOf[ValueObject])

    if (result != null){
      implicit def stringToBigDecimal(value: String) : BigDecimal = BigDecimal(value)
      this.saveDayStats(queryId, dayToCalcId, result.min, result.max, result.avg, result.median)
    }
  }

  /**
    * Aggregate and calculate stats for passed month
    * @param queryId filter query with data to calculate
    * @param monthId month for which stats should be calculated (default current month)
    */
  def calculateMonthStats(queryId: String, monthId: String = null): Unit = {
    val monthToCalcId = if (monthId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMM")) else monthId
    if (monthToCalcId.length != 6) throw new IllegalArgumentException

    val params : java.util.Map[String, Object] =  new java.util.HashMap[String, Object]()
    params.put("aggId", monthToCalcId)

    val result = mongoTemplate.mapReduce(
      Query.query(Criteria.where("_id").is(queryId)), //.and("daysStats.aggId").regex(s"^$monthToCalcId.*")),
      "filter_queries",
      "classpath:monthStatsMapper.js",
      "classpath:statsReducer.js",
      MapReduceOptions.options().scopeVariables(params).outputCollection("monthsStats_out"),
      classOf[ValueObject])

    if (result != null){
      implicit def stringToBigDecimal(value: String) : BigDecimal = BigDecimal(value)
      this.saveMonthStats(queryId, monthToCalcId, result.min, result.max, result.avg, result.median)
    }
  }

  /**
    * Aggregate and calculate stats for passed year
    * @param queryId filter query with data to calculate
    * @param yearId year for which stats should be calculated (default current year)
    */
  def calculateAnnualStats(queryId: String, yearId: String = null): Unit = {
    val yearToCalcId = if (yearId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyy")) else yearId
    if (yearToCalcId.length != 4) throw new IllegalArgumentException

    val params : java.util.Map[String, Object] =  new java.util.HashMap[String, Object]()
    params.put("aggId", yearToCalcId)

    val result = mongoTemplate.mapReduce(
      Query.query(Criteria.where("_id").is(queryId)), //.and("monthsStats.aggId").regex(s"^$yearToCalcId.*")),
      "filter_queries",
      "classpath:yearStatsMapper.js",
      "classpath:statsReducer.js",
      MapReduceOptions.options().scopeVariables(params).outputCollection("yearsStats_out"),
      classOf[ValueObject])

    if (result != null){
      implicit def stringToBigDecimal(value: String) : BigDecimal = BigDecimal(value)
      this.saveYearStats(queryId, yearToCalcId, result.min, result.max, result.avg, result.median)
    }
  }

}
