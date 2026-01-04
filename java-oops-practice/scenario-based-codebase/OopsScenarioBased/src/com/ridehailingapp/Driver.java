package com.ridehailingapp;

class Driver {
	
	//private fields for encapsulation
    String name;
    String licenseNumber;
    private double rating;

    //constructor
    Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    //method to get rating 
    public double getRating() {
        return rating;
    }
}