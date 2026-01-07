package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term; 
    protected double interestRate;
    private String status;

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.status = "PENDING";
    }

    protected double calculateEMIFormula(double principal, double rate, int months) {
        double r = rate / (12 * 100);
        return (principal * r * Math.pow(1 + r, months)) /
               (Math.pow(1 + r, months) - 1);
    }

    protected void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}