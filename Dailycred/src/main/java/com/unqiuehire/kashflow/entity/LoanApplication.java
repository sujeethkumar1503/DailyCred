package com.unqiuehire.kashflow.entity;

import com.unqiuehire.kashflow.constant.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "loan_applications")
@Getter
@Setter
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    private Long borrowerId;
    private Long lenderId;
    private Long planId;

    private Double loanAmount;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    private LocalDate applicationDate;
}