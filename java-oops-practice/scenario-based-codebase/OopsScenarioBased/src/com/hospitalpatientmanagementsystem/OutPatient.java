package com.hospitalpatientmanagementsystem;

public class OutPatient extends Patient {

	//attribute 
	String appointmentDate;
	
	//constructor
	OutPatient(int id, String name, String appointmentDate){
		super(id, name);
		this.appointmentDate=appointmentDate;
	}
	
	//overriding method
	@Override
	public void displayInfo() {
        System.out.println("Out-Patient: " + name + ", Appointment: " + appointmentDate);
	}
}
