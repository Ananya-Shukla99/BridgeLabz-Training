package com.budgetwise;

import java.util.ArrayList;

public class MonthlyBudget extends Budget {

	public MonthlyBudget(Transaction transaction, double limit, ArrayList<Transaction> arr) {
		super(transaction, limit, arr);
	}

	@Override
	public void generateReport(Transaction[] arr) {
		System.out.println(" Monthly Roport is generate ");
		System.out.println("----------------------------");
		for (Transaction t : arr) {
			System.out.println(t.type + "\t on " + t.date + "\t" + t.category + "\t " + t.amount);
		}
	}

}
