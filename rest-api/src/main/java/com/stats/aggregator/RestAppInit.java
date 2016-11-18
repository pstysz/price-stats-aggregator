package com.stats.aggregator;

import com.stats.aggregator.config.DatabaseConfig;
import com.stats.aggregator.config.RepositoryConfig;
import com.stats.aggregator.config.SecurityConfig;
import com.stats.aggregator.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@SpringBootApplication
public class RestAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestAppInit.class, args);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                 DatabaseConfig.class
                ,RepositoryConfig.class
                ,SecurityConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                SwaggerConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
