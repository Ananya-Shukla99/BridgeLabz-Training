package com.constructor.levelone;

public class CarRental {

	// Attributes
	String customerName;
	String carModel;
	int rentalDays;
	
	//constructor
	public CarRental(String customerName, String carModel, int rentalDays) {
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	
	static int perDayCost=500;
	
	public void totalCost() {
		
		System.out.println("The car "+this.carModel + "rented by "+ this.customerName+ "for rental Days "+rentalDays);
		System.out.println("The total cost will be :"+ perDayCost * rentalDays);
	}
	
}
