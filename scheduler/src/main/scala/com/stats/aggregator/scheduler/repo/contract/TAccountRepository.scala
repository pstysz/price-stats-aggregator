package com.stats.aggregator.scheduler.repo.contract

/**
  * Handle all actions on user/accounts/authorization keys
  */
trait TAccountRepository {

  /**
    * Removes expired user authorization keys from db
    */
  def removeExpiredAuthKeys() : Unit
}
