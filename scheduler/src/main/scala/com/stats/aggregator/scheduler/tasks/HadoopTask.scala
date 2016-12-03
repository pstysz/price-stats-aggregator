package com.stats.aggregator.scheduler.tasks

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component class HadoopTask {
  @Scheduled(cron = "0 10 * * * *") def doEveryHour() {
    // task execution logic
  }

  @Scheduled(cron = "0 20 23 * * *") def doEveryDay() {
    // task execution logic
  }

  @Scheduled(cron = "0 30 23 1 * *") def doEveryMonth() {
    // task execution logic
  }

  @Scheduled(cron = "0 40 23 1 1 *") def doEveryYear() {
    // task execution logic
  }
}