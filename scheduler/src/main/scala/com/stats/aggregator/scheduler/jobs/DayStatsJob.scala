package com.stats.aggregator.scheduler.jobs

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import org.apache.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataAccessException
import org.springframework.stereotype.Component

/**
  * Calculates stats for every day
  */
@throws[IllegalArgumentException]
@Component
class DayStatsJob @Autowired()(filterQueryRepository: TFilterQueryRepository, statsRepository: TStatsRepository) {

  private val logger = LogManager.getLogger(classOf[DayStatsJob])

  def calculate(dayId: String = null): Unit = {
    try {
      val dayToCalcId = if (dayId == null) LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMMdd")) else dayId
      if (dayToCalcId.length != 8) throw new IllegalArgumentException

      filterQueryRepository.getValidFilterQueryIds.foreach(id => statsRepository.calculateDayStats(id, dayToCalcId))

    } catch {
      case e @ (_ : DataAccessException | _ : IllegalArgumentException) => if (logger.isErrorEnabled) logger.error(e)
    }
  }
}


