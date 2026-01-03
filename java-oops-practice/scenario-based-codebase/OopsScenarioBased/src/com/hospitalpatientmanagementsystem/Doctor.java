package com.hospitalpatientmanagementsystem;

public class Doctor {

	//attributes
	int doctorId;
	String name;
	String specialization;
	
	 // Constructor
	Doctor(int id, String name, String specialization) 
	{
        this.doctorId = id;
        this.name = name;
        this.specialization = specialization;
    }

	//method to display information
    public void displayInfo() 
    {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}
