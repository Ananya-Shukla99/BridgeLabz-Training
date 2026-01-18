package com.budgetwise;

import java.util.ArrayList;


public class AnnualBudget extends Budget {

	public AnnualBudget(Transaction transaction, double limit, ArrayList<Transaction> arr) {
		super(transaction, limit, arr);
	}

	@Override
	public void generateReport(Transaction[] arr) {
		System.out.println(" Annual Budget Roport is generate ");
		System.out.println("----------------------------");
		double spent =0;
		for (Transaction t : arr) {
			System.out.println(t.type + "\t on " + t.date + "\t" + t.category + "\t " + t.amount);
			spent+=t.amount;
		}
		System.out.println("----------------------------");
        System.out.println( "Monthly expenditure : "+spent );
        System.out.println("Annual expenditure : "+ (spent * 12));
	}

}
