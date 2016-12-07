package com.stats.aggregator.scheduler.config

import com.mongodb.{Mongo, MongoClient}
import com.stats.aggregator.common.utils.PropertiesHelper
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(Array("com.stats.aggregator.scheduler.repo"))
class DatabaseConfig extends AbstractMongoConfiguration {
  override protected def getDatabaseName = "prize-stats-aggregator"

  @throws[Exception]
  override def mongo: Mongo = {
    new MongoClient(PropertiesHelper.getProperty("mongoDb.bindIp"), PropertiesHelper.getProperty("mongoDb.port").toInt)
  }
}
