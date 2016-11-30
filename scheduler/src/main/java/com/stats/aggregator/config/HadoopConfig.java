package com.stats.aggregator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.hadoop.config.annotation.EnableHadoop;
import org.springframework.data.hadoop.config.annotation.SpringHadoopConfigurerAdapter;
import org.springframework.data.hadoop.config.annotation.builders.HadoopConfigConfigurer;

@Configuration
@EnableHadoop
public class HadoopConfig extends SpringHadoopConfigurerAdapter {

    @Override
    public void configure(HadoopConfigConfigurer config) throws Exception {
        config.fileSystemUri("hdfs://localhost:8021");
    }

}
