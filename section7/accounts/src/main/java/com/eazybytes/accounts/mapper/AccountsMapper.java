package com.eazybytes.accounts.mapper;


import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto( Accounts accounts, AccountsDto accountsDto ){

        if (accounts == null || accountsDto == null) {
            return null;
        }

        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts){

        if (accountsDto == null || accounts == null) {
            return null;
        }
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setAccountType(accountsDto.getAccountType());
        return accounts;
    }
}
