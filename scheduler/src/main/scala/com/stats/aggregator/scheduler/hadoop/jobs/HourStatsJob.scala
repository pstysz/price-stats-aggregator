package com.stats.aggregator.scheduler.hadoop.jobs

import java.math.{MathContext, RoundingMode}
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import com.stats.aggregator.scheduler.services.contract.TRestApiClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
  * Calculates stats for every hour
  */
@Component
class HourStatsJob @Autowired()(filterQueryRepository: TFilterQueryRepository, restApiClient: TRestApiClient, statsRepository: TStatsRepository) {

  /**
    * Calculates stats for every hour for every valid query in db
    */
  def calculate() : Unit = {
    val currHourId = LocalDateTime.now.format(DateTimeFormatter.ofPattern("yyyyMMddHH"))
    val ids: Seq[String] = filterQueryRepository.getValidFilterQueryIds

    for (id <- ids){
      val prices = restApiClient.getCurrentPrices(id)

      if (prices.nonEmpty) {
        val pricesSorted = prices.sorted

        val min: BigDecimal = pricesSorted.head
        val max: BigDecimal = pricesSorted.last
        val avg: BigDecimal = (pricesSorted.sum / pricesSorted.length).round(new MathContext(2, RoundingMode.HALF_UP))
        val _ :: median :: _ = pricesSorted

        statsRepository.saveHourStats(id, currHourId, min, max, avg, median)
      }
    }
  }
}
