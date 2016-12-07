package com.stats.aggregator.scheduler.jobs

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import org.apache.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataAccessException
import org.springframework.stereotype.Component

/**
  * Calculates stats for every month
  */
@throws[IllegalArgumentException]
@Component
class MonthStatsJob @Autowired()(filterQueryRepository: TFilterQueryRepository, statsRepository: TStatsRepository) {

  private val logger = LogManager.getLogger(classOf[MonthStatsJob])

  def calculate(monthId: String = null): Unit = {
    try {
      val monthToCalcId = if (monthId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMM")) else monthId
      if (monthToCalcId.length != 6) throw new IllegalArgumentException

      filterQueryRepository.getValidFilterQueryIds.foreach(id => statsRepository.calculateMonthStats(id, monthToCalcId))

    } catch {
      case e @ (_ : DataAccessException | _ : IllegalArgumentException) => if (logger.isErrorEnabled) logger.error(e)
    }
  }
}


