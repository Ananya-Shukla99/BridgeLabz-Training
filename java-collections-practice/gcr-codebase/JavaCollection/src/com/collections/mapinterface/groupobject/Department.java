package com.collections.mapinterface.groupobject;

import java.util.*;

public class Department {
	
	//attribute
	protected String name;
	protected List<Employee> list;
	
	//constructor
	Department(String name){
		this.name=name;
		this.list= new ArrayList<>();
	}
	
	//method 
	public void addEmployee(Employee e) {
		list.add(e);
		
	}
	
	@Override 
	public String toString() {
		return name ;
	}
}
