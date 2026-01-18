package com.ecowing;

public class Kiwi extends Bird {

	public Kiwi(String name, int uniqueID) {
		super(name, "Kiwi", uniqueID);
		
	}
	
	@Override
	public void eat() {
		System.out.println("Kiwi is eating ");
	}

	@Override
	public void sleep() {
		System.out.println("Kiwi is sleeping ");
	}

}
