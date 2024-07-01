package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity{
    private Long id;
    private String name;
    private String email;
    private String mobileNumber;

}
