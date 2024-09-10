package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotNull(message = "Account Number can not be null")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits")
    @Schema(
            description = "Account Number"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be a null or Empty")
    @Schema(
            description = "Account Type"
    )
    private String accountType;

    @Schema(
            description = "Branch Address"
    )
    @NotEmpty(message = "Branch Address can not be a null or Empty")
    private String branchAddress;
}
