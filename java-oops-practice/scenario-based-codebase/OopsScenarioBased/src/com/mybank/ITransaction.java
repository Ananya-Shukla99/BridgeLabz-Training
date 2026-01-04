package com.mybank;

public interface ITransaction {

	//methods to override
	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();
}
