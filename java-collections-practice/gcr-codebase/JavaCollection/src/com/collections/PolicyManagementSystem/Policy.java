package com.collections.PolicyManagementSystem;

import java.util.Objects;

public class Policy {

	// attribute
	private int policyNumber;
	private String policyholderName;
	private int expiryDate;
	private String coverageType;
	private double premiumAmount;

	//constructor
	public Policy(int policyNumber, String policyholderName, int expiryDate, String coverageType,
			double premiumAmount) {
		this.policyNumber = policyNumber;
		this.policyholderName = policyholderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}

	//getter and setter
	public int getPolicyNumber() {
		return policyNumber;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	@Override
	public boolean equals(Object obj) {
		Policy p = (Policy) obj;
		return this.policyNumber == p.policyNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(policyNumber);
	}

	@Override
	public String toString() {
		return policyNumber + " " + policyholderName + " " + expiryDate + " " + coverageType + " " + premiumAmount;
	}

}
