package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface AccountService {

//    create an account
    void createAccount( CustomerDto customerDto );

//    Fetch account details
    CustomerDto fetchAccount(String mobileNumber);

//    update Account Details
    boolean updateAccount(CustomerDto customerDto);

//    Delete Account Details
    boolean deleteAccount(String mobileNumber);
}
