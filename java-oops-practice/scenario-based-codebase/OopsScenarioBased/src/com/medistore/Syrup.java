package com.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine{

	//super class constructor 
	public Syrup(String name, double price, LocalDate l) {
		super(name, price, l);
	}

	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(getExpiryDate().minusMonths(4));
		
	} 
}
