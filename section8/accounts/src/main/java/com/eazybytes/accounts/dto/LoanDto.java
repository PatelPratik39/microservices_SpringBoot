package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(name = "Loans",
        description = "Schema to hold Loan Information")
public class LoanDto {

//  Adding validations
    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile Number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "4365327698"
    )
    private String mobileNumber;

    @NotEmpty
    @Pattern(regexp = "^$|[0-9]{12}", message = "LoanNumber must be 12 digits")
    @Schema(description = "Loan Number of the customer", example = "548732457654")
    private String loanNumber;

    @NotEmpty(message = "LoanType can not be a null or empty")
    @Schema(
            description = "Type of the loan", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total Loan Amount should be greater than 0.00")
    @Schema(
            description = "Total loan amount", example = "100000.00"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total loan Amount should be equal or greater than zero")
    @Schema(description = "total Loan Amount Paid", example = "1000.00")
    private int amountPaid;

    @PositiveOrZero(message = "Total Outstanding amount should be equal or greater than zero")
    @Schema(description = "Total outstanding amount against a loan", example = "99000")
    private int outstandingAmount;

}
