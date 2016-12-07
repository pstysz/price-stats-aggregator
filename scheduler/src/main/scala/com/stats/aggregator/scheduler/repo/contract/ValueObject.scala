package com.stats.aggregator.scheduler.repo.contract

class ValueObject {
  var id: String = null
  var value: String = null
  override def toString: String = "ValueObject [id=" + id + ", value=" + value + "]"
}