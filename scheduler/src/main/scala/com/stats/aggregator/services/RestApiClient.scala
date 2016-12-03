package com.stats.aggregator.services

import com.stats.aggregator.common.utils.PropertiesHelper
import com.stats.aggregator.services.contract.TRestApiClient
import org.springframework.stereotype.Service

import scalaj.http._
import net.liftweb.json._

/**
  * Proxy service to connect to Rest API methods
  */
@Service
class RestApiClient extends TRestApiClient{

  implicit val formats = DefaultFormats

  /**
    * Gets list of all prices filtered by selected query
    *
    * @param queryId query with filters list
    * @return list of prices
    */
  override def getCurrentPrices(queryId: String): List[BigDecimal] = {
    val url = s"${PropertiesHelper.getProperty("rest.url")}/api/query/$queryId/prices"

    val result = Http(url)
      .header("content-type", "application/json")
      .header("x-authorization-key", "0f46592155e18d198383468fddc7dc2a")
      .header("accept", "application/json")
      .asString

    if (!result.isSuccess){
      result.throwError
    }

    //val jsonBody =  JsonParser.() (result.body)

    List[BigDecimal]()
  }
}
