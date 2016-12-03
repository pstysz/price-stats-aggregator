package com.stats.aggregator.scheduler.services.contract


trait TRestApiClient {

  /**
    * Gets list of all prices filtered by selected query
    *
    * @param queryId query with filters list
    * @return list of prices
    */
  def getCurrentPrices(queryId : String) : List[BigDecimal]

}
