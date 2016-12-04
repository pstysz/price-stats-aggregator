package com.stats.aggregator.scheduler.hadoop.containters

import java.io.{DataInput, DataOutput}

import org.apache.hadoop.hive.serde2.io.HiveDecimalWritable
import org.apache.hadoop.io.WritableComparable

/**
  * Tuple (triplet) to keep writable data of minimal, maximal and average price
  * @param min Minimal price
  * @param max Maximal price
  * @param avg Average price
  */
class MinMaxAvgWritableComparable(val min: String, val max : String, val avg : String)
  extends WritableComparable[MinMaxAvgWritableComparable]{

  val minWritable: HiveDecimalWritable = new HiveDecimalWritable(min)
  val maxWritable: HiveDecimalWritable = new HiveDecimalWritable(max)
  val avgWritable: HiveDecimalWritable = new HiveDecimalWritable(avg)
  
  
  override def write(out: DataOutput): Unit = {
    minWritable.write(out)
    maxWritable.write(out)
    avgWritable.write(out)
  }

  override def readFields(in: DataInput): Unit = {
    minWritable.readFields(in)
    maxWritable.readFields(in)
    avgWritable.readFields(in)
  }

  override def compareTo(o: MinMaxAvgWritableComparable): Int = {
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

    val minMaxAvgWritable : MinMaxAvgWritableComparable = o.asInstanceOf[MinMaxAvgWritableComparable]
    if (minMaxAvgWritable eq null) return false

    min.equals(minMaxAvgWritable.min) && max.equals(minMaxAvgWritable.max) && avg.equals(minMaxAvgWritable.avg)
  }

  override def hashCode(): Int = {
    min.hashCode() + max.hashCode() + avg.hashCode()
  }
}
