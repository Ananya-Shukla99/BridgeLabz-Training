package com.virtualpetcareapp;

public class Dog extends Pet{

	public Dog(String name, int age) {
		super(name, "Dog", age);
	}

	//abstract method 
	void makeSound() {
		System.out.println("Dog is barking");
	} 

	//concrete method
	public void play() {
        super.play();
        System.out.println("Dog loves fetching the ball!");
    }
	
}
