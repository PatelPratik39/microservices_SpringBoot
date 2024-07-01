package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Entity(name = "baseEntity")
public class BaseEntity {

    private LocalDateTime createdAt;
    private String CreatedBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
