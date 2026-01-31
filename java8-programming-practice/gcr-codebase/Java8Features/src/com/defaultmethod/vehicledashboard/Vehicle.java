package com.defaultmethod.vehicledashboard;

@FunctionalInterface
public interface Vehicle {

	void displaySpeed();
	
	//default method for non electric vehicle 
	default void displayBatteryStatus() {
        System.out.println("No battery status");
    }
}
