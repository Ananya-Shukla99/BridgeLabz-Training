package com.ecowing;


public class Eagle extends Bird implements Flyable {

	public Eagle(String name, int uniqueID) {
		super(name, "Eagle", uniqueID);
		
	}
	
	@Override
	public void eat() {
		System.out.println("Eagle is eating ");
	}

	@Override
	public void sleep() {
		System.out.println("Eagle is sleeping ");
	}

	@Override
	public void fly() {
		System.out.println("Eagle can fly");
	}
	
}
