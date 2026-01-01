package com.Inheritance.levelone;

public class AnimalMain {

	public static void main(String[]args) {
		Animal a;
		
		a=new Dog("Tommy", 3);
		a.makeSound();
		
		a=new Cat("Bobby", 2);
		a.makeSound();

		a=new Bird("Tweety", 5);
		a.makeSound();
	}
}
