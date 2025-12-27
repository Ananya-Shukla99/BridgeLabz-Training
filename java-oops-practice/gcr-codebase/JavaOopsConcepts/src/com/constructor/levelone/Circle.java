package com.constructor.levelone;

public class Circle {

	// Attributes
	double radius;
	
	//Default constructor
	public Circle() {
		this(1.0);
	}
	
	//Parameterized constructor 
	public Circle(double radius){
		this.radius=radius;
	}
	
	//area of circle
	public double area(double radius) {
		return Math.PI *radius*radius;
	}
	
}
