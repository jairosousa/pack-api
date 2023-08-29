package com.jnsdev.parkapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 29/08/2023 - 15:33
 */

@Configuration
public class SpringDocOpenApiConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Rest API - Spring Park")
                        .description("API para gestão de estacionamento de veiculos")
                        .version("v1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .contact(new Contact().name("Jairo Nascimento").email("jairo.sousa@spring-park.com"))
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Github repository")
                        .url("https://github.com/jairosousa/pack-api"));
    }
}
