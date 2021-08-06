
package com.example.springbootelasticsearchrepository.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData(){
        Contact contact = new Contact("Kushagra Singh","https://linkedin.com/in/kushagra-singh-6bab9318b","kushagra.cse.11498@gmail.com");
        return new ApiInfo(
                "REST API for Movie Catalog",
                "Demo for Movie cstslog project",
                "1.0",
                "Terms of Services",
                contact,
                "Licence version 1.9",
                "",
                new ArrayList<>());

    }

}
