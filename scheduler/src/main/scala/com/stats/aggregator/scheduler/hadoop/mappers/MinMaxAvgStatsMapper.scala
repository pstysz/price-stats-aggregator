package com.stats.aggregator.scheduler.hadoop.mappers

import java.io.IOException

import com.stats.aggregator.scheduler.hadoop.containters.MinMaxAvgWritableComparable
import org.apache.hadoop.io.Text
import org.apache.hadoop.mapreduce.Mapper


object MinMaxAvgStatsMapper extends Mapper[String, String, Text, MinMaxAvgWritableComparable]{

  private val ID = 0
  private val MIN = 1
  private val MAX = 2
  private val AVG = 3

  @throws[IOException]
  @throws[InterruptedException]
  override def map(key: String, value: String, context: Mapper[String, String, Text, MinMaxAvgWritableComparable]#Context): Unit = {

    val values: Array[String] = value.toString.split(",")
    if (values.length != 4) return

    context.write(new Text(values(ID)), new MinMaxAvgWritableComparable(values(MIN), values(MAX), values(AVG)))
  }

}
