package com.microservice.Loans;

import com.microservice.Loans.dto.LoansContactInfoDto;
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
@OpenAPIDefinition(
		info = @Info(
			title = "Loan microservice REST API Documentation",
			description = "BankApp Loan Microservice REST API Documentation",
			version = "v1",
			contact = @Contact(
					name = "Pratik Patel",
					email = "pratik@email.com",
					url = "https://www.myBankApps.com"
			),
			license = @License(
					name = "Apache 2.0",
					url = "https://www.myBankApps.com"
			)
		),
		externalDocs = @ExternalDocumentation(
				description = "BankApp Loan microservices REST API Documentation",
				url = "http://localhost:8090/swagger-ui/index.html"
		)
)
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
