package com.collections.PolicyManagementSystem;

import java.util.*;

public class PolicyManager {

	HashSet<Policy> hashSet = new HashSet<>();

	LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();

	TreeSet<Policy> treeSet = new TreeSet<>((p1, p2) -> p1.getExpiryDate() - p2.getExpiryDate());

	// Add policy
	public void addPolicy(Policy p) {
		hashSet.add(p);
		linkedHashSet.add(p);
		treeSet.add(p);
	}

	// Display all policies
	public void displayAll() {
		for (Policy p : hashSet) {
			System.out.println(p);
		}
	}

	// Policies expiring soon
	public void expiringSoon() {

		for (Policy p : hashSet) {
			if (p.getExpiryDate() <= 30) {
				System.out.println(p);
			}
		}
	}

	// Policies by coverage type
	public void byCoverage(String type) {

		for (Policy p : hashSet) {

			if (p.getCoverageType().equalsIgnoreCase(type)) {
				System.out.println(p);
			}
		}
	}
}
