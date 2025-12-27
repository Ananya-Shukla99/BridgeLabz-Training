package com.constructor.levelone;

public class Person {
    
	// Attributes
	String name;
	double height;
	double weight;
	
	//Parameterized Constructor
	public Person(String name, double height, double weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	//copy constructor
	public Person(Person first) {
		this.name=first.name;
		this.height=first.height;
		this.weight=first.weight;
	}
}
