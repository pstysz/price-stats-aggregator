package com.stats.aggregator.scheduler.repo

import java.time.LocalDate

import com.stats.aggregator.DTOs.AuthorizationKey
import com.stats.aggregator.common.utils.{HashCodeHelper, PropertiesHelper}
import com.stats.aggregator.scheduler.repo.contract.TAccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.{Criteria, Query}
import org.springframework.stereotype.Repository

/**
  * Handle all actions on user/accounts/authorization keys
  */
@Repository class AccountRepository @Autowired()(mongoTemplate: MongoTemplate) extends TAccountRepository {

  if (!mongoTemplate.collectionExists(classOf[AuthorizationKey])) mongoTemplate.createCollection(classOf[AuthorizationKey])
  private val swaggerUserId = HashCodeHelper.hash(
    PropertiesHelper.getProperty("db.swagger.name") + PropertiesHelper.getProperty("db.swagger.pass"))
  private val testUserId = HashCodeHelper.hash(
    PropertiesHelper.getProperty("db.testuser.name") + PropertiesHelper.getProperty("db.testuser.pass"))
  private val schedulerUserId = HashCodeHelper.hash(
    PropertiesHelper.getProperty("db.scheduler.name") + PropertiesHelper.getProperty("db.scheduler.pass"))

  /**
    * Removes expired user authorization keys from db
    */
  override def removeExpiredAuthKeys(): Unit = {
    val systemUsers = List(swaggerUserId, testUserId, schedulerUserId)
    val yesterday : LocalDate  = LocalDate.now().minusDays(1)

    mongoTemplate.remove(
      Query.query(Criteria.where("user.$id").nin(systemUsers)
        .and("touchDate").lte(yesterday))
    )
  }
}