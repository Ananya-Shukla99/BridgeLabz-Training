package com.ecowing;

public class Duck extends Bird implements Swimmable{

	public Duck(String name, int uniqueID) {
		super(name, "Duck", uniqueID);
		
	}
	
	@Override
	public void eat() {
		System.out.println("Duck is eating ");
	}

	@Override
	public void sleep() {
		System.out.println("Duck is sleeping ");
	}

	@Override
	public void swim() {
		System.out.println("Duck can swim");
	}
	
}
