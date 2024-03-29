package com.bank.loan.domain;

import java.util.List;

import com.bank.loan.utils.enums.LoanType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Loan {

    // atributos
    private LoanType type;
    private Integer interestRate;
    
}
