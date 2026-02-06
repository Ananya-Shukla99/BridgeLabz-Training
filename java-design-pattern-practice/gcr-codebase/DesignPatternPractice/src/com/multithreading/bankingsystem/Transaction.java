package com.multithreading.bankingsystem;

import java.time.LocalDateTime;

public class Transaction implements Runnable {

	private BankAccount account;
	private int amount;
	private String customerName;

	public Transaction(BankAccount account, int amount, String customerName) {
		this.account = account;
		this.amount = amount;
		this.customerName = customerName;
	}

	@Override
	public void run() {

		// Print current time
		LocalDateTime time = LocalDateTime.now();

		System.out.println(
				"[" + Thread.currentThread().getName() + "] " + "Attempting to withdraw " + amount + " at " + time);

		boolean success = account.withdraw(amount);

		if (success) {

			System.out.println("Transaction successful: " + customerName + ", Amount: " + amount + ", Balance: "
					+ account.getBalance());

		} else {

			System.out
					.println("Transaction FAILED: " + customerName + ", Amount: " + amount + ", Insufficient balance");
		}
	}
}
