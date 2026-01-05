package com.collegeinformationsystem;

public class Faculty extends Person{

	// Private attributes 
	protected String department;
	
	//constructor
	Faculty(int id, String name, String email,String department){
		super(id, name, email);
		this.department=department;
	}
	
	//method overriding
	@Override
	public void printDetails() {
		System.out.println("Faculty name : "+name);
		System.out.println("Faculty id : "+id);
		System.out.println("Faculty email : "+email);
		System.out.println("Faculty department : "+department);
	}
}
 