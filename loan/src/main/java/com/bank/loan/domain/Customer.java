package com.bank.loan.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    
 // atributos
    private int age;
    private String cpf;
    private String name;
    private double income;
    private String location;

    
}