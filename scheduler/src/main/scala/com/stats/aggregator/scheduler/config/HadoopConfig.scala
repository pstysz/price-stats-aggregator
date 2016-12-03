package com.stats.aggregator.scheduler.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.hadoop.config.annotation.EnableHadoop
import org.springframework.data.hadoop.config.annotation.SpringHadoopConfigurerAdapter
import org.springframework.data.hadoop.config.annotation.builders.HadoopConfigConfigurer

@Configuration
@EnableHadoop class HadoopConfig extends SpringHadoopConfigurerAdapter {

  @throws[Exception]
  override def configure(config: HadoopConfigConfigurer): Unit = {
    config.fileSystemUri("hdfs://localhost:8021")
  }
}