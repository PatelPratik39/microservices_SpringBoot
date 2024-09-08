package com.eazybytes.accounts.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
Custom Exception create

 */

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistException extends RuntimeException{

    public CustomerAlreadyExistException(String message){
        super(message);
    }
}
