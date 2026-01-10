package com.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine{

	//suer class constructor
	public Tablet(String name, double price, LocalDate l) {
		super(name, price, l);
	}
	
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(getExpiryDate().minusMonths(3));
	}

}
