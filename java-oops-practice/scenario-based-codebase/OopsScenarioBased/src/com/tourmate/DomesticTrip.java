package com.tourmate;

public class DomesticTrip extends Trip {

	//constructor 
	public DomesticTrip(String destination, int duration,Transport t, Hotel h, Activity a) {
		super(destination, duration,t, h , a);
	}

	//booking method 
	public void book() {
    	System.out.println(" Domestic trip is booked to :"+getDestination());
    	 System.out.println("Total Budget: ₹" + getTotalBudget());
    }
	
	//cancel method
	public void cancel() {
    	System.out.println(" Domestic trip is cancelled");
    	
    }
}
