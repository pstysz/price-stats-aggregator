package com.stats.aggregator.scheduler

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(Array("com.stats.aggregator.scheduler.config", "com.stats.aggregator.scheduler.tasks"))
class AppInit {
}

@SpringBootApplication
@ComponentScan(Array("com.stats.aggregator.scheduler.config", "com.stats.aggregator.scheduler.tasks"))
object SchedulerAppInit extends App {
    override def main(args: Array[String]): Unit = {
        SpringApplication run classOf[AppInit]
    }
}
