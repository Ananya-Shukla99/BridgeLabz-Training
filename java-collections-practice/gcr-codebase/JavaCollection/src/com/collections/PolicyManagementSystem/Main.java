package com.collections.PolicyManagementSystem;

public class Main {

	public static void main(String[] args) {

		PolicyManager pm = new PolicyManager();

		pm.addPolicy(new Policy(101, "Ravi", 20, "Health", 5000));
		pm.addPolicy(new Policy(102, "Amit", 50, "Auto", 3000));
		pm.addPolicy(new Policy(103, "Neha", 10, "Home", 8000));
		pm.addPolicy(new Policy(101, "Ravi", 20, "Health", 5000));
		pm.addPolicy(new Policy(103, "Neha", 10, "Home", 8000));

		System.out.println("All Policies:");
		pm.displayAll();

		System.out.println("\nExpiring Soon:");
		pm.expiringSoon();

		System.out.println("\nHealth Policies:");
		pm.byCoverage("Health");
	}
}
