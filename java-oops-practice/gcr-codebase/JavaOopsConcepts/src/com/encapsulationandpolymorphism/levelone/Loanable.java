package com.encapsulationandpolymorphism.levelone;

public interface Loanable {
	
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}
