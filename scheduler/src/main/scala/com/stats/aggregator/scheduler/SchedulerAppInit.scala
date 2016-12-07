package com.stats.aggregator.scheduler

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication //ToDo: how the hell force it to scan recursively the main package??!!
@ComponentScan(Array("com.stats.aggregator.scheduler.config", "com.stats.aggregator.scheduler.tasks",
  "com.stats.aggregator.scheduler.services", "com.stats.aggregator.scheduler.repo",
  "com.stats.aggregator.scheduler.jobs"))
class AppInit {
}

@SpringBootApplication
@ComponentScan(Array("com.stats.aggregator.scheduler.config", "com.stats.aggregator.scheduler.tasks",
  "com.stats.aggregator.scheduler.services", "com.stats.aggregator.scheduler.repo",
  "com.stats.aggregator.scheduler.jobs"))
object SchedulerAppInit extends App {

    override def main(args: Array[String]): Unit = {
      SpringApplication.run(classOf[AppInit], args: _*)
    }
}
