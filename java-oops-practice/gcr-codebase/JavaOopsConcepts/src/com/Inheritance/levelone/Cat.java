package com.Inheritance.levelone;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name , age);
	}
	
	public void makeSound() {
		System.out.println("Cat Mewo !");
	}
}
