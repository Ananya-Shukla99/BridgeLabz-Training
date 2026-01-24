package com.collections.mapinterface.groupobject;

public class Employee {
    //attributes
	protected String name;
	
	//constructor
	Employee(String name,  Department d){
		this.name=name;
		d.addEmployee(this);
	}
	
	//method\
	@Override 
	public String toString() {
		return name ;
	}
}
