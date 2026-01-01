package com.Inheritance.leveltwo;

public class BankAccountMain {

	public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA101", 5000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA202", 3000, 5);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 10000, 24);

        savings.displayAccountType();
        savings.displayAccountDetails();

        System.out.println();

        checking.displayAccountType();
        checking.displayAccountDetails();

        System.out.println();

        fd.displayAccountType();
        fd.displayAccountDetails();
    }
}
