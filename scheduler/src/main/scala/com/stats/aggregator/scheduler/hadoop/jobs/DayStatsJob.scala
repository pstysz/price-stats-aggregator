package com.stats.aggregator.scheduler.hadoop.jobs

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component;

/**
  * Calculates stats for every day
  */
@throws[IllegalArgumentException]
@Component
class DayStatsJob @Autowired()(filterQueryRepository: TFilterQueryRepository, statsRepository: TStatsRepository) {

  def calculate(dayId: String = null): Unit = {
    val currDayId = if (dayId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMMdd")) else dayId
    if (currDayId.length != 8) throw new IllegalArgumentException

    val ids: Seq[String] = filterQueryRepository.getValidFilterQueryIds

    for (id <- ids){



//      val prices: Seq[BigDecimal] = restApiClient.getCurrentPrices(id)
//
//      if (prices.nonEmpty) {
//        val pricesSorted = prices.sorted
//
//        val min: BigDecimal = pricesSorted.head
//        val max: BigDecimal = pricesSorted.last
//        val avg: BigDecimal = pricesSorted.sum / pricesSorted.size
//        val (lower, upper) = pricesSorted.splitAt(pricesSorted.size / 2)
//        val median: BigDecimal = if (pricesSorted.size % 2 == 0) (lower.last + upper.head) / BigDecimal(2) else upper.head
//
//        statsRepository.saveHourStats(id, currHourId,
//          min.setScale(2, BigDecimal.RoundingMode.HALF_UP),
//          max.setScale(2, BigDecimal.RoundingMode.HALF_UP),
//          avg.setScale(2, BigDecimal.RoundingMode.HALF_UP),
//          median.setScale(2, BigDecimal.RoundingMode.HALF_UP))
    }
  }
}


