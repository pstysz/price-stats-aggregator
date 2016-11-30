package com.stats.aggregator.scheduler.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HadoopTask {

    @Scheduled(cron = "0 10 * * * *")
    public void doEveryHour() {

        // task execution logic
    }

    @Scheduled(cron = "0 20 23 * * *")
    public void doEveryDay() {

        // task execution logic
    }

    @Scheduled(cron = "0 30 23 1 * *")
    public void doEveryMonth() {

        // task execution logic
    }

    @Scheduled(cron = "0 40 23 1 1 *")
    public void doEveryYear() {

        // task execution logic
    }
}
