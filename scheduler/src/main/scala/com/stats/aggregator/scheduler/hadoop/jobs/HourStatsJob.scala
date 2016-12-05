package com.stats.aggregator.scheduler.hadoop.jobs

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
        val avg: BigDecimal = pricesSorted.sum / pricesSorted.length
        val _ :: median :: _ = pricesSorted

        statsRepository.saveHourStats(id, currHourId,
          min.setScale(2, BigDecimal.RoundingMode.HALF_UP),
          max.setScale(2, BigDecimal.RoundingMode.HALF_UP),
          avg.setScale(2, BigDecimal.RoundingMode.HALF_UP),
          median.setScale(2, BigDecimal.RoundingMode.HALF_UP))
      }
    }
  }
}
