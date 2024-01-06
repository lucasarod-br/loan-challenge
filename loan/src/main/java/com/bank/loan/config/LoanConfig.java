package com.bank.loan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bank.loan.application.LoanUseCase;
import com.bank.loan.application.ports.in.LoanCase;

@Configuration
public class LoanConfig {
    
    @Bean
    public LoanCase loanService() {
        return new LoanUseCase();
    }
}
