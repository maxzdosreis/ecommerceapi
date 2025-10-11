package org.maxzdosreis.ecommerceapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Book Author API")
                        .version("1.0")
                        .description("API Documentation")
                        .termsOfService("https://github.com/maxzdosreis")
                        .license(new License()
                                .name("MIT License (MIT)")
                                .url("hhttps://mit-license.org/")
                        )
                );
    }
}
