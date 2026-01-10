package com.tourmate;

public class InternationalTrip extends Trip{

	//constructor
	public InternationalTrip(String destination, int duration,Transport t, Hotel h, Activity a) {
		super(destination, duration,t, h , a);
	}
	@Override
	public void book() {
		
    	System.out.println("International Trip is bookeds to : "+getDestination());
        System.out.println("Passport & visa required.");
        System.out.println("Total Budget: ₹" + getTotalBudget());
	}
	
	@Override
	public void cancel() {
    	System.out.println("International trip is cancelled");
    	
    }
}
