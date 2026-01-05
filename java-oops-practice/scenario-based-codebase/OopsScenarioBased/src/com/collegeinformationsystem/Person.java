package com.collegeinformationsystem;

public abstract class Person {

	//attributes
	protected int id;
	protected String name;
	protected String email;
	
	//constructor
	Person(int id, String name, String email){
		this.id=id;
		this.name=name;
		this.email=email;
	}

	
	//method
	public abstract void printDetails() ;
}
