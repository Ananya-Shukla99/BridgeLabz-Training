package com.constructor.levelone;

public class BankAccountMain {

	public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(001, "Rahul", 5000.0);

        sa.displayAccountDetails();

        sa.deposit(2000);
        sa.withdraw(1500);

        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
