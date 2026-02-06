package com.multithreading.bankingsystem;

public class BankingSystem {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		// Create transactions
		Transaction t1 = new Transaction(account, 3000, "Customer-1");

		Transaction t2 = new Transaction(account, 4000, "Customer-2");

		Transaction t3 = new Transaction(account, 2000, "Customer-3");

		Transaction t4 = new Transaction(account, 5000, "Customer-4");

		Transaction t5 = new Transaction(account, 1500, "Customer-5");

		// Create threads object 
		Thread th1 = new Thread(t1, "Customer1");
		Thread th2 = new Thread(t2, "Customer2");
		Thread th3 = new Thread(t3, "Customer3");
		Thread th4 = new Thread(t4, "Customer4");
		Thread th5 = new Thread(t5, "Customer5");

		// Display state before start
		System.out.println("Thread States Before Start:");
		System.out.println(th1.getName() + ": " + th1.getState());
		System.out.println(th2.getName() + ": " + th2.getState());
		System.out.println(th3.getName() + ": " + th3.getState());
		System.out.println(th4.getName() + ": " + th4.getState());
		System.out.println(th5.getName() + ": " + th5.getState());

		System.out.println("----------------------------------");

		// Start threads
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();

		try {
			// Wait for all to finish
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------------");
		System.out.println("Final Balance: " + account.getBalance());
	}
}
