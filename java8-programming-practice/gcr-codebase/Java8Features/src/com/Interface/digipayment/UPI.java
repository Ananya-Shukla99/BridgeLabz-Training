package com.Interface.digipayment;

public class UPI  implements Payable{

	  public void pay(double amount) {
	        System.out.println("Paid " + amount + " using UPI");
	    }
}
