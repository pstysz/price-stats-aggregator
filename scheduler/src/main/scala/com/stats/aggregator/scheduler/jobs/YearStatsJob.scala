package com.stats.aggregator.scheduler.jobs

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import org.apache.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataAccessException
import org.springframework.stereotype.Component

/**
  * Calculates stats for every year
  */
@throws[IllegalArgumentException]
@Component
class YearStatsJob @Autowired()(filterQueryRepository: TFilterQueryRepository, statsRepository: TStatsRepository) {

  private val logger = LogManager.getLogger(classOf[YearStatsJob])

  def calculate(yearId: String = null): Unit = {
    try {
      val yearToCalcId = if (yearId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyy")) else yearId
      if (yearToCalcId.length != 4) throw new IllegalArgumentException

      filterQueryRepository.getValidFilterQueryIds.foreach(id => statsRepository.calculateAnnualStats(id, yearToCalcId))

    } catch {
      case e @ (_ : DataAccessException | _ : IllegalArgumentException) => if (logger.isErrorEnabled) logger.error(e)
    }
  }
}


