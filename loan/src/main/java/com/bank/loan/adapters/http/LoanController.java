package com.bank.loan.adapters.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.loan.adapters.http.dto.LoanRequestDTO;
import com.bank.loan.adapters.http.dto.LoanResponseDTO;
import com.bank.loan.application.ports.in.LoanCase;
import com.bank.loan.domain.Customer;
import com.bank.loan.domain.Loan;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    private final LoanCase loanCase;

    LoanController(LoanCase loanCase) {
        this.loanCase = loanCase;
    }

    @PostMapping
    public ResponseEntity<LoanResponseDTO> determineEligibleLoans(@RequestBody LoanRequestDTO requestDTO) {
        Customer customer = convertToCustomer(requestDTO);
        List<Loan> eligibleLoans = loanCase.determineEligibleLoans(customer);
        LoanResponseDTO responseDTO = convertToResponseDTO(customer.getName(), eligibleLoans);

        return ResponseEntity.ok(responseDTO);
    }

    private Customer convertToCustomer(LoanRequestDTO requestDTO) {
        return Customer.builder()
                .name(requestDTO.getName())
                .age(requestDTO.getAge())
                .income(requestDTO.getIncome())
                .location(requestDTO.getLocation())
                .build();
    }

    private LoanResponseDTO convertToResponseDTO(String customerName, List<Loan> loans) {
        LoanResponseDTO responseDTO = new LoanResponseDTO();
        responseDTO.setCustomerName(customerName);
        responseDTO.setLoans(loans);
        return responseDTO;
    }
}
