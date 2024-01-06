package com.bank.loan.adapters.http.dto;

import java.util.List;

import com.bank.loan.domain.Loan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanResponseDTO {
    String customerName;
    List<Loan> loans;
}
