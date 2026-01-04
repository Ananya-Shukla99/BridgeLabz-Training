package com.ridehailingapp;

public class Vehicle {

	//attributes
	String vehicleNumber;
    int capacity;
    String type;
    double rate;

    //constructor
    Vehicle(String vehicleNumber, int capacity, String type, double rate) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
    }
}
