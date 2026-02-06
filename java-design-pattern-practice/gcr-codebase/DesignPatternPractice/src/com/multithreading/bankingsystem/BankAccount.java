package com.multithreading.bankingsystem;

public class BankAccount {

	private int balance=10000;
	
	public boolean withdraw(int amount) {
		
		if(balance>=amount){
			try {
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			balance=balance-amount;
			return true;
		}else {
			return false;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
