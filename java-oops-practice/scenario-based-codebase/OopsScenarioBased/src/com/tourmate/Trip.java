package com.tourmate;

public abstract class Trip implements IBookable {

	//attribute
	private String destination;
	private int duration;
	protected Transport t;
	protected Hotel h;
	protected Activity a;
	
	
	//constructor
	public Trip(String destination, int duration, Transport t, Hotel h, Activity a) {
		this.destination = destination;
		this.duration = duration;
		this.t = t;
	    this.h = h;
	    this.a = a;
	}
	
	//getter
	public String getDestination() {
		return destination;
	}
	public int  getDuration() {
		return duration;
	}
	
	@Override
    public abstract void book() ;

	@Override
    public void cancel() {
    	
    	System.out.println("Trip is cancelled");
    	
    }
    
	public double getTotalBudget() {
		return h.getCost()+a.getCost()+t.getCost();
	}
}
