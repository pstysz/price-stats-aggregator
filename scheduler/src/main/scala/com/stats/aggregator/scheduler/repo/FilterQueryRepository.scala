package com.stats.aggregator.scheduler.repo

import com.stats.aggregator.DTOs.FilterQuery
import com.stats.aggregator.scheduler.repo.contract.TFilterQueryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.{Criteria, Query}
import org.springframework.stereotype.Repository

import scala.collection.JavaConverters._

/**
  * Handles all action on filter queries
  */

@Repository class FilterQueryRepository @Autowired()(mongoTemplate: MongoTemplate) extends TFilterQueryRepository{

  /**
    * Gets filter queries with valid query filter
    *
    * @return Ids of filter queries
    */
  override def getValidFilterQueryIds: List[String] = {
    val q = new Query()
    q.addCriteria(Criteria.where("filters").exists(true))
    q.fields().exclude("userId").exclude("filters")
      .exclude("yearsStats").exclude("monthsStats").exclude("daysStats")

    val result = mongoTemplate.find(
      q,
      classOf[FilterQuery]).asScala.toList.map(_.getId)

    result
  }
}
