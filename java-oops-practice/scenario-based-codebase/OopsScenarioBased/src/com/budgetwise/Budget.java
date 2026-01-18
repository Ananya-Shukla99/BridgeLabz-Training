package com.budgetwise;

import java.util.*;

public abstract class Budget implements  IAnalyzable{

	//attribute
	protected Transaction transaction;
	protected double income;
	protected double limit; //per Transaction
	protected ArrayList<Transaction>arr= new ArrayList<>();
	
	//constructor
	public Budget(Transaction transaction, double limit, ArrayList<Transaction> arr) {
		
		this.transaction = transaction;
		this.limit = limit;
		this.arr = arr;
	}
	
	
	public double NetSaving (Transaction []arr) {
		double spent=0;
		
		for(Transaction t:arr) {
		    spent += t.amount;
		}
		return income -spent;
	}
	
	//abstract method
	@Override
	public abstract void generateReport(Transaction []arr);
	
	@Override
	public void detectOverspend(Transaction []arr) {
		
		System.out.println("Detecting overspend ");
		for(Transaction t:arr) {
			if(t.amount >limit) {
				System.out.println(t.type + " is an over spend transaction of :" + (t.amount-limit));
			}
		}
	}
	
}
