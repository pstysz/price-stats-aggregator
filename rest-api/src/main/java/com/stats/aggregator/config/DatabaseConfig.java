package com.stats.aggregator.config;

import com.stats.aggregator.common.utils.PropertiesHelper;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan("com.stats.aggregator.data")
@EnableMongoRepositories("com.stats.aggregator.data.repositories")
public class DatabaseConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "prize-stats-aggregator";
    }


    @Override
    public Mongo mongo() throws Exception {

        Mongo mongo = new MongoClient(PropertiesHelper.getProperty("mongoDb.bindIp"), Integer.parseInt(PropertiesHelper.getProperty("mongoDb.port")));

        return mongo;
    }
}
