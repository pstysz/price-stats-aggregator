package com.stats.aggregator.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.stats.aggregator.common.utils.PropertiesHelper;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories("com.stats.aggregator.repositories")
public class DatabaseConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "prize-stats-aggregator";
    }

    @Override
    public Mongo mongo() throws Exception {
        Mongo mongo = new MongoClient(PropertiesHelper.getProperty("mongoDb.bindIp"),
                Integer.parseInt(PropertiesHelper.getProperty("mongoDb.port")));
        return mongo;
    }
}
