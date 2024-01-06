package com.bank.loan.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bank.loan.application.ports.in.LoanCase;
import com.bank.loan.domain.Customer;
import com.bank.loan.domain.Loan;
import com.bank.loan.utils.enums.LoanType;

public class LoanUseCase implements LoanCase {
    @Override
    public List<Loan> determineEligibleLoans(Customer customer) {
        HashSet<Loan> eligibleLoans = new HashSet<>();
        Loan personalLoan = Loan.builder().type(LoanType.PERSONAL).interestRate(4).build();
        Loan consignedLoan = Loan.builder().type(LoanType.CONSIGNED).interestRate(2).build();
        Loan guaranteedLoan = Loan.builder().type(LoanType.GUARANTEED).interestRate(3).build();

        if (customer.getIncome() >= 5000) {
            eligibleLoans.add(consignedLoan);
        }

        if (customer.getIncome() <= 3000 || (customer.getIncome() >= 3000 && customer.getIncome() <= 5000 ) && customer.getAge() < 30
                && customer.getLocation() == "SP") {
            eligibleLoans.add(personalLoan);
            eligibleLoans.add(guaranteedLoan);
        }


        return new ArrayList<>(eligibleLoans);
    }
}
