package com.ecowing;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, int uniqueID) {
		super(name, "Sparrow", uniqueID);
		
	}
	
	@Override
	public void eat() {
		System.out.println("Sparrow is eating ");
	}

	@Override
	public void sleep() {
		System.out.println("Sparrow is sleeping ");
	}

	@Override
	public void fly() {
		System.out.println("Sparrow can fly");
	}
	
}
