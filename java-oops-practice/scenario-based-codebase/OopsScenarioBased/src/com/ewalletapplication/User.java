package com.ewalletapplication;

public class User {

	// Protected fields
	protected int userId;
	protected String name;
	private Wallet wallet;
	

	 // Constructor
	User(int userId , String name){
		this.userId=userId;
		this.name=name;
	}
	
	//setter to wallet 
	public void setWallet(Wallet wallet) {
		this.wallet=wallet;
	}
	
	//getter for wallet
	public Wallet getWallet() {
		return wallet;
	}
	
	//methods for balance
	void viewBalance() {
		System.out.println("Current Balance : "+ wallet.getBalance());
	}
	
	//methods for transaction
	void viewTransactions() {
		System.out.println("Transactions for " + name);
		wallet.showTransactions();
	}
}
