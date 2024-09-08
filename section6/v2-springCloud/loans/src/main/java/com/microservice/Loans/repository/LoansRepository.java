package com.microservice.Loans.repository;

import com.microservice.Loans.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoansRepository extends JpaRepository< Loans, Long > {
//    find a customer from repository using MobileNumber

    Optional<Loans> findByMobileNumber(String mobileNumber);

//    Optional<Loans> findByLoanNumbers(String loanNumber);
}
