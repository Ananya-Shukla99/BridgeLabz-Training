package com.smartcitytransport;

public interface TransportService {

	String getName();

	double getFare();

	String getRoute();

	String getTime();

	//default method 
	default void printServiceDetails() {
		System.out.println(getName() + " " + getRoute() + " " + getTime() + "  Fare: " + getFare());

	}

}
