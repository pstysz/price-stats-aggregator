package com.stats.aggregator.scheduler.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanupTask {

    @Scheduled(cron = "0 0 0 * * *")
    public void doEveryDay() {

        //ToDo: remove auth keys
    }
}

