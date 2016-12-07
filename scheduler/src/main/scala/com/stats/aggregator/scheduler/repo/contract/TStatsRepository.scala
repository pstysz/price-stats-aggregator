package com.stats.aggregator.scheduler.repo.contract

/**
  * Handles all actions on statistic data
  */
trait TStatsRepository {
  /**
    * Saves stats values to passed object
    * @param hourId Aggregation id of hour; Format: 'yyyyMMddHH'
    * @param min minimal price value to save
    * @param max maximal price value to save
    * @param avg average price value to save
    * @param median median price value to save
    */
  def saveHourStats(queryId: String, hourId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null) : Unit

  /**
    * Saves stats values to passed object
    * @param dayId Aggregation id of the day; Format: 'yyyyMMdd'
    * @param min minimal price value to save
    * @param max maximal price value to save
    * @param avg average price value to save
    * @param median median price value to save
    */
  def saveDayStats(queryId: String, dayId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null) : Unit

  /**
    * Saves stats values to passed object
    * @param monthId Aggregation id of the month; Format: 'yyyyMM'
    * @param min minimal price value to save
    * @param max maximal price value to save
    * @param avg average price value to save
    * @param median median price value to save
    */
  def saveMonthStats(queryId: String, monthId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null) : Unit

  /**
    * Saves stats values to passed object
    * @param yearId Aggregation id of the year; Format: 'yyyy'
    * @param min minimal price value to save
    * @param max maximal price value to save
    * @param avg average price value to save
    * @param median median price value to save
    */
  def saveYearStats(queryId: String, yearId: String, min: BigDecimal, max: BigDecimal, avg: BigDecimal, median: BigDecimal = null) : Unit

  /**
    * Aggregate and calculate stats for passed day
    * @param queryId filter query with data to calculate
    * @param dayId day for which stats should be calculated (default today)
    */
  def calculateDayStats(queryId: String, dayId: String = null): Unit
}
