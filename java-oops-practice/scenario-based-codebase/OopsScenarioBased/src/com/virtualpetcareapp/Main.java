package com.virtualpetcareapp;

public class Main {

	public static void main(String []args) {
		
		  Pet pet = new Dog("Tommy", 5);

	        pet.makeSound();
	        pet.feed();
	        pet.play();
	        pet.sleep();

	        System.out.println("\nPet Status:");
	        pet.showStatus();
	        
	     Pet pet2 = new Cat("Mini", 3);
	     
	        pet2.makeSound();
	        pet2.feed();
	        pet2.play();
	        pet2.sleep();

	        System.out.println("\nPet Status:");
	        pet2.showStatus();
	        
	     Pet pet3 = new Cat("Mini", 3);
		     
	        pet3.makeSound();
	        pet3.feed();
	        pet3.play();
	        pet3.sleep();

	        System.out.println("\nPet Status:");
	        pet3.showStatus();
	}
}
