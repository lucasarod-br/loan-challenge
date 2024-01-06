package com.bank.loan.domain;

import com.bank.loan.utils.enums.LoanType;

public class Loan {

    // atributos
    private LoanType type;
    private Integer interestRate;  ;

    // getters e setters
    public LoanType getType() {
        return type;
    }
    public void setType(LoanType type) {
        this.type = type;
    }

    public Integer getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }
    
    
}
