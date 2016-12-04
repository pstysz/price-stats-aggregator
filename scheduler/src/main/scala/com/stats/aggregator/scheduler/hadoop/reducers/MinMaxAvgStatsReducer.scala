package com.stats.aggregator.scheduler.hadoop.reducers

import org.apache.hadoop.io.{FloatWritable, IntWritable}
import org.apache.hadoop.mapreduce.Reducer

class MinMaxAvgStatsReducer extends Reducer[IntWritable, IntWritable, IntWritable, FloatWritable] {


  }
