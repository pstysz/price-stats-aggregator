package com.stats.aggregator.scheduler.services

import com.stats.aggregator.common.utils.PropertiesHelper
import com.stats.aggregator.scheduler.services.contract.TRestApiClient
import org.springframework.stereotype.Service

import scalaj.http._
import net.liftweb.json._
import scala.language.implicitConversions

/**
  * Proxy service to connect to Rest API methods
  */
@Service
class RestApiClient extends TRestApiClient{

  implicit val formats = DefaultFormats

  /**
    * Gets list of all prices, for current hour, filtered by selected query
    *
    * @param queryId query with filters list
    * @return list of prices
    */
  override def getCurrentPrices(queryId: String): List[BigDecimal] = {
    val url = s"${PropertiesHelper.getProperty("rest.url", "http://localhost:5000")}/api/query/$queryId/prices"

    val result = Http(url)
      .header("content-type", "application/json")
      .header("x-authorization-key", "0f46592155e18d198383468fddc7dc2a")
      .header("accept", "application/json")
      .asString

    if (!result.isSuccess){
      result.throwError
    }

    val valuesList = (parse(result.body) \\ "result").children  // List[JString]
    if (valuesList.nonEmpty){
      return valuesList.head.extract[List[String]].map(x => BigDecimal(x))
    }

    List[BigDecimal]()
  }
}
