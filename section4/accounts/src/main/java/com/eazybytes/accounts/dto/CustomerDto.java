package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of The Customer" , example = "Chucha Singh"
    )
    @NotEmpty(message = "Name can not be null or empty!!")
    @Size(min=5, max =30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of The Customer" , example = "chucha@email.com"
    )
    @NotEmpty(message = "Name can not be null or empty!!")
    @Email(message = "Email Address should be a valid value !!")
    private String email;

    @Schema(
            description = "PhoneNumber of The Customer" , example = "1234567890"
    )
    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
