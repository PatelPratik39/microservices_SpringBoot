package com.microservice.Loans.service.impl;


import com.microservice.Loans.constants.LoansConstants;
import com.microservice.Loans.dto.LoanDto;
import com.microservice.Loans.entity.Loans;
import com.microservice.Loans.exception.LoanAlreadyExistsException;
import com.microservice.Loans.exception.ResourceNotFoundException;
import com.microservice.Loans.mapper.LoansMapper;
import com.microservice.Loans.repository.LoansRepository;
import com.microservice.Loans.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoanServiceImpl implements LoanService {

    private LoansRepository loansRepository;


    @Override
    public void createLoan ( String mobileNumber ) {
//        first, I need to find a customer that has a loan present or not in LoanRepository

        Optional< Loans > optionalLoans = loansRepository.findByMobileNumber(mobileNumber);

//        if loan present than send an exception, the loan is already present that is custom exception
        if(optionalLoans.isPresent()){
            throw new LoanAlreadyExistsException("Loan already registered with given mobileNumber "+mobileNumber);
        }
//        if loan doesn't present than create new one and save it into LoanRepository using createNewLoan method
        loansRepository.save(createNewLoan(mobileNumber));
    }

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return Loan Details based on a given mobileNumber
     */

    @Override
    public LoanDto fetchLoan ( String mobileNumber ) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)
        );
        return LoansMapper.mapToLoanDto(loans, new LoanDto());   //converting an entity object to DTO Object
    }

    /**
     *
     * @param loanDto - LoansDto Object
     * @return boolean indicating if the update of loan details is successful or not
     */

    @Override
    public boolean updateLoan ( LoanDto loanDto ) {
        Loans loans = loansRepository.findByMobileNumber(loanDto.getMobileNumber())
                .orElseThrow(() -> new ResourceNotFoundException("Loan", "LoanNumber", loanDto.getLoanNumber()));
        LoansMapper.mapToLoans(loanDto, loans);
        loansRepository.save(loans);
        return true;
    }

    /**
     * @param mobileNumber - Input MobileNumber
     * @return boolean indicating if the delete of loan details is successful or not
     */

    @Override
    public boolean deleteLoan ( String mobileNumber ) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber));
        loansRepository.deleteById(loans.getLoanId());
        return true;
    }

    /*
        - createNewLoan will create new loan using customer's mobileNumber
        - it will return new loan details and store into loanRepo.
     */
    private Loans createNewLoan(String mobileNumber){
//        Create new Loan Object
        Loans newLoan = new Loans();
//        generate loan number using random() with 12 digits
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        newLoan.setLoanNumber(Long.toString(randomLoanNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(LoansConstants.NEW_LOAN_LIMIT);
        return newLoan;
    }

}












