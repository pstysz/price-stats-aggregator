package com.stats.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.stats.aggregator.config", "com.stats.aggregator.scheduler.tasks"})
public class SchedulerAppInit {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SchedulerAppInit.class, args);
    }
}
