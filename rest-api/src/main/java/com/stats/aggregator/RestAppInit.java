package com.stats.aggregator;

import com.stats.aggregator.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@SpringBootApplication
@EnableCaching
public class RestAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestAppInit.class, args);

        DatabaseInit.run();
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
