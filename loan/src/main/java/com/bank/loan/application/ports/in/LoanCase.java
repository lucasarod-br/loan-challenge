package com.bank.loan.application.ports.in;

import java.util.List;

import com.bank.loan.domain.Customer;
import com.bank.loan.domain.Loan;

public interface LoanCase {
    List<Loan> determineEligibleLoans(Customer customer);
}
