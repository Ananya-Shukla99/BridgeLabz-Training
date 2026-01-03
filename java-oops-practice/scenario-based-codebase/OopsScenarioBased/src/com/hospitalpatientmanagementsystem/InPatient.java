package com.hospitalpatientmanagementsystem;

public class InPatient extends Patient {
	
    //attribute 
	int daysAdmitted;
	
	//constructor
	InPatient(int id, String name, int days){
		super(id, name);
		this.daysAdmitted=days;
	}
	
	//Override the method
	@Override
	public void displayInfo() {
		System.out.println("In-Patient: " + name + ", Days Admitted: " + daysAdmitted);

	}
}
