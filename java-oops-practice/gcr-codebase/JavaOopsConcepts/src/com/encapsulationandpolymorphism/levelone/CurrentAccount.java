package com.encapsulationandpolymorphism.levelone;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02; 

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Current Account loan approved: " + amount);
        } else {
            System.out.println("Current Account loan denied.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= amount;
    }
}
