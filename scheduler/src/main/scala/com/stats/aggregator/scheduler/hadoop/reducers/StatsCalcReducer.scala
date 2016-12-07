package com.stats.aggregator.scheduler.hadoop.reducers

import java.lang.Iterable

import com.stats.aggregator.scheduler.hadoop.containters.StatsWritableComparable
import org.apache.hadoop.io.Text
import org.apache.hadoop.mapreduce.Reducer

import scala.collection.mutable.ListBuffer

@deprecated("use mongoDB reducer instead", "1.0")
class StatsCalcReducer extends Reducer[Text, StatsWritableComparable, Text, StatsWritableComparable] {

  private var min : BigDecimal = null
  private var max : BigDecimal = null
  private var avgCount : Int = 0
  private var avgSum : BigDecimal = BigDecimal("0")
  private var mediansBuffer : ListBuffer[BigDecimal] = ListBuffer()

  override def reduce(key: Text, values: Iterable[StatsWritableComparable], context: Reducer[Text, StatsWritableComparable, Text, StatsWritableComparable]#Context): Unit = {

    val itr = values.iterator()

    while (itr.hasNext){
      val tuple = itr.next
      avgCount += 1
      avgSum += tuple.avgDecimal
      mediansBuffer += tuple.medDecimal

      if (min == null || tuple.minDecimal < min){
        min = tuple.minDecimal
      }

      if (max == null || tuple.maxDecimal > max){
        max = tuple.maxDecimal
      }
    }

    val totalAvg = avgSum / BigDecimal(avgCount)

    //It doesn't make much sense, it's just a hadoop demo, not median-calculating-demo
    val medians = mediansBuffer.toList.sorted
    val (lower, upper) = medians.splitAt(medians.size / 2)
    val median: BigDecimal = if (medians.size % 2 == 0) (lower.last + upper.head) / BigDecimal(2) else upper.head

    context.write(key, StatsWritableComparable(
      min.bigDecimal.toPlainString,
      min.bigDecimal.toPlainString,
      totalAvg.bigDecimal.toPlainString,
      median.bigDecimal.toPlainString))
  }

  override def cleanup(context: Reducer[Text, StatsWritableComparable, Text, StatsWritableComparable]#Context): Unit = {

  }
}
