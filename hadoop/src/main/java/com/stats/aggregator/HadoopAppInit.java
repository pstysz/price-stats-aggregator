package com.stats.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@SpringBootApplication
public class HadoopAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HadoopAppInit.class, args);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
