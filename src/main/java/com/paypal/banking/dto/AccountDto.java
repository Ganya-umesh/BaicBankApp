package com.paypal.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //to automatically generate constructors and getters and setters
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;


    }

