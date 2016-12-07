package com.stats.aggregator.scheduler.hadoop.mappers

import java.io.IOException

import com.stats.aggregator.scheduler.hadoop.containters.StatsWritableComparable
import org.apache.hadoop.io.Text
import org.apache.hadoop.mapreduce.Mapper

@deprecated("use mongoDB mapper instead", "1.0")
class StatsCalcMapper extends Mapper[String, String, Text, StatsWritableComparable]{

  private val ID = 0
  private val MIN = 1
  private val MAX = 2
  private val AVG = 3
  private val MED = 4

  @throws[IOException]
  @throws[InterruptedException]
  override def map(key: String, value: String, context: Mapper[String, String, Text, StatsWritableComparable]#Context): Unit = {

    val values: Array[String] = value.toString.split(",")
    if (values.length != 5) return

    context.write(new Text(values(ID)), StatsWritableComparable(values(MIN), values(MAX), values(AVG), values(MED)))
  }

}
