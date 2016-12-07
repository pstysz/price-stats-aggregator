package com.stats.aggregator.scheduler.jobs

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import com.stats.aggregator.scheduler.services.contract.TRestApiClient
import org.apache.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataAccessException
import org.springframework.stereotype.Component

/**
  * Calculates stats for every hour
  */
@throws[IllegalArgumentException]
@Component
class HourStatsJob @Autowired()(filterQueryRepository: TFilterQueryRepository, restApiClient: TRestApiClient, statsRepository: TStatsRepository) {

  private val logger = LogManager.getLogger(classOf[HourStatsJob])

  /**
    * Calculates stats for every hour for every valid query in db
    * @param hourId optional id of hour to calculate stats (current hour default)
    */
  def calculate(hourId: String = null): Unit = {
    try {
      val currHourId = if (hourId == null) LocalDateTime.now.format(DateTimeFormatter.ofPattern("yyyyMMddHH")) else hourId
      if (currHourId.length != 10) throw new IllegalArgumentException

      val ids: Seq[String] = filterQueryRepository.getValidFilterQueryIds

      for (id <- ids) {
        val prices: Seq[BigDecimal] = restApiClient.getCurrentPrices(id)

        if (prices.nonEmpty) {
          val pricesSorted = prices.sorted

          val min: BigDecimal = pricesSorted.head
          val max: BigDecimal = pricesSorted.last
          val avg: BigDecimal = pricesSorted.sum / pricesSorted.size
          val (lower, upper) = pricesSorted.splitAt(pricesSorted.size / 2)
          val median: BigDecimal = if (pricesSorted.size % 2 == 0) (lower.last + upper.head) / BigDecimal(2) else upper.head

          statsRepository.saveHourStats(id, currHourId,
            min.setScale(2, BigDecimal.RoundingMode.HALF_UP),
            max.setScale(2, BigDecimal.RoundingMode.HALF_UP),
            avg.setScale(2, BigDecimal.RoundingMode.HALF_UP),
            median.setScale(2, BigDecimal.RoundingMode.HALF_UP))
        }
      }
    } catch {
      case e @ (_ : DataAccessException | _ : IllegalArgumentException) => if (logger.isErrorEnabled) logger.error(e)
    }
  }
}
