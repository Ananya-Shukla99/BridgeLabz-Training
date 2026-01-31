package com.methodreferences.hospital;

public class Patient {

	String name;
	int id;
	
	//constructor
	public Patient(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void print() {
		System.out.println("Patient id : "+id +" - name : "+name);
	}
}
