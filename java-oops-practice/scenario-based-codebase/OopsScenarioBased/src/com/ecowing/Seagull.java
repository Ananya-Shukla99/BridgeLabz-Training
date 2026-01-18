package com.ecowing;

public class Seagull extends Bird implements Flyable, Swimmable{

	public Seagull(String name, int uniqueID) {
		super(name, "Seaagull", uniqueID);
		
	}

	public void eat() {
		System.out.println("Seagull is eating ");
	}

	public void sleep() {
		System.out.println("Seagull is sleeping ");
	}
	
	public void fly() {
		System.out.println("Seagull can fly");
	}
	
	public void swim() {
		System.out.println("Seagull can swim");
	}
}
