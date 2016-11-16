package com.stats.aggregator.config;


import com.stats.aggregator.repositories.allegroApiClient.WebApiService;
import com.stats.aggregator.repositories.allegroApiClient.WebApiServiceLocator;
import com.stats.aggregator.repositories.allegroApiClient.WebApiServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stats.aggregator.repositories")
public class RepositoryConfig {

    @Bean
    public WebApiService webApiService() {
        return new WebApiServiceLocator();
    }

    @Bean
    public WebApiServicePort webApiServicePort(WebApiService webApiService) throws javax.xml.rpc.ServiceException {
        return webApiService.getservicePort();
    }
}