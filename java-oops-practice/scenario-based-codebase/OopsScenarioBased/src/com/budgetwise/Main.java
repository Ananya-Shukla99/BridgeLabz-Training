package com.budgetwise;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create transactions
        Transaction t1 = new Transaction(5000, "Expense", "2025-01-05", "Rent");
        Transaction t2 = new Transaction(1200, "Expense", "2025-01-10", "Groceries");
        Transaction t3 = new Transaction(800, "Expense", "2025-01-15", "Transport");

        // Store transactions in list
        ArrayList<Transaction> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);

        // Convert ArrayList to array (as your methods use array)
        Transaction[] arr = list.toArray(new Transaction[0]);

        // Monthly Budget
        Budget monthly = new MonthlyBudget(null, 1000, list);
        monthly.income = 10000;

        System.out.println("===== MONTHLY BUDGET =====");
        monthly.generateReport(arr);
        monthly.detectOverspend(arr);
        System.out.println("Net Savings: " + monthly.NetSaving(arr));

        // Annual Budget 
        Budget annual = new AnnualBudget(null, 2000, list);
        annual.income = 120000;

        System.out.println("\n===== ANNUAL BUDGET =====");
        annual.generateReport(arr);
        annual.detectOverspend(arr);
        System.out.println("Net Savings: " + annual.NetSaving(arr));
    }
}
