package com.microservice.Cards;

import com.microservice.Cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(value = {CardsContactInfoDto.class} )
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Bank App Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Pratik Patel",
						email = "pratik@email.com",
						url = "http://localhost:9000/swagger-ui/index.html"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://localhost:9000/swagger-ui/index.html"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank App Cards microservice REST API Documentation",
				url = "http://localhost:9000/swagger-ui/index.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
		System.err.println("Cards microservice REST API Documentation");
	}

}
