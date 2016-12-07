package com.stats.aggregator.scheduler.repo.contract

/**
  * Contains parsed by liftweb stats calculated from map reduce stats calculator
  * (Liftweb requires that the case class has to be defined at the outer level of map-reduce class hierarchy)
  */
case class CalculatedStatsContainer(min: String, max : String, avg : String, median : String)
