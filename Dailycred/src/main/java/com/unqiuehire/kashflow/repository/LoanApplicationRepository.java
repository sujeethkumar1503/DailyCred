package com.unqiuehire.kashflow.repository;


import com.unqiuehire.kashflow.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanApplicationRepository
        extends JpaRepository<LoanApplication, Long> {

    List<LoanApplication> findByBorrowerId(Long borrowerId);

    List<LoanApplication> findByLenderId(Long lenderId);
}