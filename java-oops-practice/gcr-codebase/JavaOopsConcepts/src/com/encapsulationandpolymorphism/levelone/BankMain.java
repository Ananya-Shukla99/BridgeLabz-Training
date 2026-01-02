package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class BankMain{

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA1001", "Alice", 10000));
        accounts.add(new CurrentAccount("CA2001", "Bob", 15000));

        for (BankAccount account : accounts) {
            System.out.println(account.getAccountSummary());

            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000);
            }

            System.out.println("--------------------------------");
        }
    }
}
