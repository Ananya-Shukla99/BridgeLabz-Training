package com.Inheritance.levelone;

public class Employee {

	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee name : "+this.name);
		System.out.println("Employee id : "+this.id);
		System.out.println("Employee salary : "+this.salary);
		
	}
}
