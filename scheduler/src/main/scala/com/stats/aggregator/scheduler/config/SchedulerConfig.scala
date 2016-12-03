package com.stats.aggregator.scheduler.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.SchedulingConfigurer
import org.springframework.scheduling.config.ScheduledTaskRegistrar
import java.util.concurrent.Executor
import java.util.concurrent.Executors

@Configuration
@EnableScheduling class SchedulerConfig extends SchedulingConfigurer {
  def configureTasks(taskRegistrar: ScheduledTaskRegistrar) {
    taskRegistrar.setScheduler(taskExecutor)
  }

  @Bean(destroyMethod = "shutdown") def taskExecutor: Executor = {
    Executors.newScheduledThreadPool(100)
  }
}