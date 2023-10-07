package com.archneo.ecommerce.swagger;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	OpenAPI ecommerceAPI() {
		return new OpenAPI()
				.info(new Info().title("ECommerce API").description("ECommerce API Description").version("1.0")
						.license(new License().name("Apache 2.0").url("http://www.apache.org/licenses/LICENSE-2.0")))
				.externalDocs(new ExternalDocumentation().description("Shubhanjan Banerjee, shubhanjan.banerjee@cognizant.com")
						.url("https://www.cognizant.com"));
	}

}