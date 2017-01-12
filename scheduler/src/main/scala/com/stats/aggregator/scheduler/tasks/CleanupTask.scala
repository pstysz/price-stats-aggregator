package com.stats.aggregator.scheduler.tasks

import com.stats.aggregator.scheduler.repo.contract.TAccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
  * Db clean up, remove old authorization tokens, prepare stats documents on db for new month/year etc
  */
@Component class CleanupTask @Autowired()(accountRepository: TAccountRepository) {

  /**
    * Task runs every day at midnight
    */
  @Scheduled(cron = "0 0 0 * * *") def doEveryDay() {
    //accountRepository.removeExpiredAuthKeys()
  }
}