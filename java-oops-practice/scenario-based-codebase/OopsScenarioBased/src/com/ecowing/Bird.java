package com.ecowing;

public class Bird {

	//attribute
	protected String name;
	protected String  species;
	protected int  uniqueID;
	
	//constructor
	public Bird(String name, String species, int uniqueID) {
		this.name = name;
		this.species = species;
		this.uniqueID = uniqueID;
	}
	
	public void eat() {
		System.out.println("Bird is eating ");
	}

	public void sleep() {
		System.out.println("Bird is sleeping ");
	}
	
}
