package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface AccountService {

    void createAccount( CustomerDto customerDto );

    CustomerDto fetchAccount(String mobileNumber);
}
