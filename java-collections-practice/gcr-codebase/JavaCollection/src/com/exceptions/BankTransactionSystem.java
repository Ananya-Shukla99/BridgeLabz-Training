package com.exceptions;

import java.util.Scanner;

public class BankTransactionSystem {

	public static void withdraw(int amount, double balance)
			throws InsufficientBalanceException, IllegalArgumentException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount!");
		} else {
			System.out.println("Withdrawal successful, new balance: " + (balance - amount));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double balance = 5000.0;
		try {
			System.out.println("Enter withdrawal amount :");
			int amount = sc.nextInt();

			withdraw(amount, balance);
		} catch (InsufficientBalanceException | IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		} finally {
			sc.close();
		}

	}

}
