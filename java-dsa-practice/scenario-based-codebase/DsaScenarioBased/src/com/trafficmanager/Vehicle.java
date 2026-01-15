package com.trafficmanager;

class Vehicle {
	
	//attributes
    String number;
    Vehicle next;

    //constructor
    Vehicle(String number) {
        this.number = number;
        this.next = null;
    }
}
