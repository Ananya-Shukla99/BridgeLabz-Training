package com.designprinciples.levelone;

public class Doctor {

	private String name;

    public Doctor(String name) {
        this.name = name;
    }

    // Communication method
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
    
}
