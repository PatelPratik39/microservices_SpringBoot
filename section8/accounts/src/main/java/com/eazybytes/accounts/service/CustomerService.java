package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface CustomerService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
