package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository< Accounts, Long > {

    Optional< Accounts > findByCustomerId(Long customerId);

}
