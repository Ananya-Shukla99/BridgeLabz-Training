package com.virtualpetcareapp;

public class Cat extends Pet {

	public Cat(String name, int age) {
		super(name, "Cat", age);
	}

	//abstract method 
	void makeSound() {
		System.out.println("Cat says meow");
	} 
	
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cat sleeps peacefully.");
    }
	
}
