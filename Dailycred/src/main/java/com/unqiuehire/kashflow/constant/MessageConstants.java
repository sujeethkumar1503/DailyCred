package com.unqiuehire.kashflow.constant;

import lombok.Getter;

@Getter
public enum MessageConstants {

    LENDER_CREATED("Lender created successfully"),
    LENDER_UPDATED("Lender updated successfully"),
    LENDER_FOUND("Lender fetched successfully"),
    LENDERS_FOUND("Lenders fetched successfully"),
    LENDER_DELETED("Lender deleted successfully"),
    LENDER_NOT_FOUND("Lender not found"),

    LOAN_APPLICATION_CREATED("Loan application created successfully"),
    LOAN_APPLICATION_FOUND("Loan application fetched successfully"),
    LOAN_APPLICATIONS_FOUND("Loan applications fetched successfully"),
    LOAN_APPLICATION_NOT_FOUND("Loan application not found"),
    LOAN_APPLICATION_CANCELLED("Loan application cancelled successfully");

    private final String message;

    MessageConstants(String message) {
        this.message = message;
    }

}