package com.stats.aggregator.scheduler.tasks

import com.stats.aggregator.scheduler.services.contract.TRestApiClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component class HadoopTask @Autowired()(restApiClient: TRestApiClient) {

  @Scheduled(initialDelay=10000, fixedRate=60000) def justForTest() {
    restApiClient getCurrentPrices "1"
    // task execution logic
  }

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