package com.medistore;

import java.time.LocalDate;

public class Injection extends  Medicine{

	//super constructor
	public Injection(String name, double price, LocalDate e) {
		super(name, price, e);
	}


	@Override
	public  boolean checkExpiry() {
		
		return LocalDate.now().isAfter(getExpiryDate());
	}
	
}
