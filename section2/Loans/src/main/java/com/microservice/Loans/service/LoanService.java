package com.microservice.Loans.service;

import com.microservice.Loans.dto.LoanDto;

public interface LoanService {
//      Create a Loan

    /*
        @Param mobileNumber - using customer mobileNumber that will be used as primary key for all services
     */
        void createLoan(String mobileNumber);

        /*
         @Param mobileNumber - mobileNumber is an input
         @return Loan Details based on given mobileNumber
         */
        LoanDto fetchLoan(String mobileNumber);


        /*
            @param loansDto - LoansDto Object
            @return Loan Details based on a given mobileNumber
         */
        boolean updateLoan(LoanDto loanDto);
    /*
        @param loansDto - LoansDto Object
        @return Loan Details based on a given mobileNumber
     */
        boolean deleteLoan (String mobileNumber);

}


