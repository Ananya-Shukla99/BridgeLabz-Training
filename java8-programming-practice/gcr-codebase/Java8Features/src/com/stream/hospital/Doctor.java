package com.stream.hospital;

import java.util.List;

public class Doctor {

	String name;
	List<String>availability;
	String speciality;
	
	
	public Doctor(String name, List<String> availability, String speciality) {
		
		this.name = name;
		this.availability = availability;
		this.speciality = speciality;
	}


	@Override
	public String toString() {
		return "Doctor [name=" + name + ", availability=" + availability + ", speciality=" + speciality + "]";
	}
	
}
