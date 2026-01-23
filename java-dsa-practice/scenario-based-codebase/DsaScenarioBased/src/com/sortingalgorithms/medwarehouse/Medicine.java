package com.sortingalgorithms.medwarehouse;

public class Medicine {

	// attribute
	public String name;
	private int expireDays;// Expire date
	protected String shopName;

	// constructor
	public Medicine(String name, int expireDays, String shopName) {
		this.name = name;
		this.expireDays = expireDays;
		this.shopName = shopName;
	}

	// getter
	public int getExpiryDays() {
		return expireDays;
	}

}
