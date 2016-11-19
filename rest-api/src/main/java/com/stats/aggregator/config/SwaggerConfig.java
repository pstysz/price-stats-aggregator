package com.stats.aggregator.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
                //.genericModelSubstitutes(ResponseEntity.class)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stats.aggregator.controllers"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(Lists.newArrayList(new ParameterBuilder()
                        .name("x-authorization-key")
                        .modelRef(new ModelRef("string"))
                        .parameterType("header")
                        .required(true).defaultValue("n092f349f23904")
                        .hidden(true)
                        .build()));
//                .apiInfo(apiInfo());
    }

}