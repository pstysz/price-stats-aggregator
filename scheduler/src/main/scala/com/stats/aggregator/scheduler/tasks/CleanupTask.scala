package com.stats.aggregator.scheduler.tasks

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component class CleanupTask {
  @Scheduled(cron = "0 0 0 * * *") def doEveryDay() {
    //ToDo: remove auth keys
  }
}