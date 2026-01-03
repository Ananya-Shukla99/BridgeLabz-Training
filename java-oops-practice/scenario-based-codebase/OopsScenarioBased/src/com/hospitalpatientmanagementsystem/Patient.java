package com.hospitalpatientmanagementsystem;

public class Patient {
	
	// Private fields - data encapsulation
	protected int id;
	protected String name;
	private	String medicalHistory;

	//constructor
	Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.medicalHistory = "Not Provided";
    }
	
	//constructor
	Patient ( int id, String name, String medicalHistory) {
		this.id=id;
		this.name=name;
		this.medicalHistory=medicalHistory;
	}
		
	//public getter 
	public String getSummary() {
		return "Patient id :"+ id + ", Name : "+name;
	}
	
	//method for displaying information
	public void displayInfo() {
		System.out.println(getSummary());
	}
	
	//public getter
	public String getMedicalHistory() {
		return medicalHistory;
	}
}
