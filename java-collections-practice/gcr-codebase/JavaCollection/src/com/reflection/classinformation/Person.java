package com.reflection.classinformation;

public class Person {
	// Fields
	public String name;
	private int age;

	// Constructors
	public Person() {
		this.name = "Unknown";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Methods
	public void greet() {
		System.out.println("Hello, my name is " + name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
