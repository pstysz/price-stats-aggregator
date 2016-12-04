package com.stats.aggregator.scheduler.repo.contract

/**
  * Handles all action on filter queries
  */
trait TFilterQueryRepository{

  /**
    * Gets filter queries with valid query filter
    * @return Ids of filter queries
    */
  def getValidFilterQueryIds: List[String]
}
