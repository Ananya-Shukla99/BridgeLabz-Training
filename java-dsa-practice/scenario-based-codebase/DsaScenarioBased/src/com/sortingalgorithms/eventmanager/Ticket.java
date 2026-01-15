package com.sortingalgorithms.eventmanager;

public class Ticket {

	//attribute
	String eventName;
    double price;

    //constructor
    Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    @Override
    public String toString() {
        return eventName + " - ₹" + price;
    }
}
