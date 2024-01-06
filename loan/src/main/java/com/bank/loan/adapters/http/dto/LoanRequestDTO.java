package com.bank.loan.adapters.http.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanRequestDTO {
    private int age;
    private String cpf;
    private String name;
    private double income;
    private String location;
}