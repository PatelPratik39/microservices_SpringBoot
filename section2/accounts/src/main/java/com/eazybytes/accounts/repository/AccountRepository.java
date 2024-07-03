package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository< Accounts, Long > {

    Optional< Accounts > findByCustomerId(Long customerId);


//    custom Abstract method used so i need to annotate this customer abstract method with
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}
