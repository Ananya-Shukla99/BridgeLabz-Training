package com.methodreferences.invoice;

public class Invoice {

	int transactionIDs;

	public Invoice(int transactionIDs) {
		this.transactionIDs = transactionIDs;
	}

	@Override
	public String toString() {
		return "Invoice [transactionIDs = " + transactionIDs + "]";
	}
	
}
