package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
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
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice RESTApi Documentation",
				description = "Bank Accounts microservice REST API Documentation",
				version = "v1",
				contact= @Contact(
						name = "Pratik Patel",
						email = "pratik@softwareengineer.com",
						url = "https://pratik@email.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://pratik@email.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Accounts microservice REST API Documentation",
				url = "Bank Accounts microservice REST API Documentation"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
