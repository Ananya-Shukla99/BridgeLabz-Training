package com.virtualpetcareapp;

public class Bird extends Pet {

	public Bird(String name, int age) {
		super(name, "Bird", age);
	}

	//abstract method 
	void makeSound() {
		System.out.println("Bird is chirping");
	} 

	@Override
    public void feed() {
        super.feed();
        System.out.println("Bird pecks at seeds.");
    }
}
