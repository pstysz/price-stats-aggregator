package com.stats.aggregator.scheduler.hadoop.containters

import java.io.{DataInput, DataOutput}

import org.apache.hadoop.hive.serde2.io.HiveDecimalWritable
import org.apache.hadoop.io.WritableComparable

/**
  * Tuple to keep writable data of minimal, maximal, median and average price
  * @param min Minimal price
  * @param max Maximal price
  * @param avg Average price
  * @param med Median price
  */
@deprecated("use mongoDB mapreduce instead", "1.0")
case class StatsWritableComparable(min: String, max : String, avg : String, med : String)
  extends WritableComparable[StatsWritableComparable]{

  implicit def toWritable(value: String) : HiveDecimalWritable = {
    new HiveDecimalWritable(value)
  }

  def minDecimal : BigDecimal = min.getHiveDecimal.bigDecimalValue
  def maxDecimal : BigDecimal = max.getHiveDecimal.bigDecimalValue
  def avgDecimal : BigDecimal = avg.getHiveDecimal.bigDecimalValue
  def medDecimal : BigDecimal = med.getHiveDecimal.bigDecimalValue

  override def write(out: DataOutput): Unit = {
    min.write(out)
    max.write(out)
    avg.write(out)
    med.write(out)
  }

  override def readFields(in: DataInput): Unit = {
    min.readFields(in)
    max.readFields(in)
    avg.readFields(in)
    med.readFields(in)
  }

  override def compareTo(o: StatsWritableComparable): Int = {
    var comparison = min.compareTo(o.min)

    if (comparison != 0) {
      return comparison
    }

    comparison =  max.compareTo(o.max)

    if (comparison != 0) {
      return comparison
    }

    avg.compareTo(o.avg)
  }

  override def equals(o : Any): Boolean = {
    if (o == null || this.getClass != o.getClass) return false

    val minMaxAvgWritable : StatsWritableComparable = o.asInstanceOf[StatsWritableComparable]
    if (minMaxAvgWritable eq null) return false

    min.equals(minMaxAvgWritable.min) && max.equals(minMaxAvgWritable.max) &&
      avg.equals(minMaxAvgWritable.avg) && med.equals(minMaxAvgWritable.med)
  }

  override def hashCode(): Int = {
    min.hashCode() + max.hashCode() + avg.hashCode() + med.hashCode()
  }
}
