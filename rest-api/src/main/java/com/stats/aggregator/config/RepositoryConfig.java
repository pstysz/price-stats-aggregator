package com.stats.aggregator.config;


import com.stats.aggregator.repositories.allegroApiClient.WebApiService;
import com.stats.aggregator.repositories.allegroApiClient.WebApiServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stats.aggregator.data.repositories")
public class RepositoryConfig {

    @Bean
    public WebApiService webApiService() {
        return new WebApiServiceLocator();
    }
}