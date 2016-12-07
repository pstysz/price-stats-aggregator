package com.stats.aggregator.scheduler.tasks

import com.stats.aggregator.scheduler.jobs.{DayStatsJob, HourStatsJob, MonthStatsJob, YearStatsJob}
import com.stats.aggregator.scheduler.services.contract.TRestApiClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
  * Scheduler. Runs stats calculating jobs every hour, day, month and year
  */
@Component class StatsCalculatingTask @Autowired()(restApiClient: TRestApiClient,
                                                   hourStatsJob: HourStatsJob,
                                                   dayStatsJob: DayStatsJob,
                                                   monthStatsJob: MonthStatsJob,
                                                   yearStatsJob: YearStatsJob) {

  @Scheduled(initialDelay=10000, fixedDelay = 999999999) def justForTestStartsOnceAfter10sec() {
    //yearStatsJob.calculate()
  }

  /**
    * Task runs 10 minutes after every hour
    */
  @Scheduled(cron = "0 10 * * * *") def doEveryHour() {
    hourStatsJob.calculate()
  }

  /**
    * Task runs everyday, 20 minutes after 23 hour
    */
  @Scheduled(cron = "0 20 23 * * *") def doEveryDay() {
    dayStatsJob.calculate()
  }

  /**
    * Task runs once in a month, at 23:30
    */
  @Scheduled(cron = "0 30 23 1 * *") def doEveryMonth() {
    monthStatsJob.calculate()
  }

  /**
    * Task runs once in a year, at 23:40
    */
  @Scheduled(cron = "0 40 23 1 1 *") def doEveryYear() {
    yearStatsJob.calculate()
  }
}