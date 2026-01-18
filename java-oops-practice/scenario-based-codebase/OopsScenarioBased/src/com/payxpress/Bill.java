package com.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable 
{

	protected String type;
	protected double amount;
	protected LocalDate dueDate;
	private boolean isPaid; 
	protected double penaltyRate; 

	// Constructor 
	public Bill(String type, double amount, LocalDate dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}

	// Constructor for recurring bill
	public Bill(String type, double amount) {
		this(type, amount, LocalDate.now().plusMonths(1));
	}

	public boolean isPaid() {
		return isPaid;
	}

	// Late fee calculation using operators
	public double calculateLateFee() {
		if (LocalDate.now().isAfter(dueDate)) {
			return amount + (amount * penaltyRate);
		}
		return amount;
	}

	@Override
	public void pay() {
		if (!isPaid) {
			double finalAmount = calculateLateFee();
			System.out.println(type + " bill paid: ₹" + finalAmount);
			isPaid = true;
		} else {
			System.out.println(type + " bill already paid.");
		}
	}
}
