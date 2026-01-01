package com.Inheritance.levelone;

public class Manager extends Employee{
	
	int teamSize;

	public Manager(String name, int id, double salary,int teamSize) {
		super(name, id, salary);
		this.teamSize=teamSize;
	}
	
	public void displayDetails() {
		System.out.println("Team Size is :"+ this.teamSize);
	}
}
