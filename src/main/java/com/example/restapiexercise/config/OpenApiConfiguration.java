package com.example.restapiexercise.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI getOpenApiConfiguration() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Project Name")
                                .description("Project description goes here")
                                .version("0.0.1")
                                .license(
                                        new License()
                                                .name("Some licence")
                                                .url("https://licence-url.com")
                                )
                );
    }
}
