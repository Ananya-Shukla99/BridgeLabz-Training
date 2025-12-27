package com.constructor.levelone;

public class Student {

	public int rollNumber;
	protected String name;
	private double cgpa;
	
	//constructor
	public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
	
	public Student() {
        // default constructor
    }
	// Public method to access CGPA
    public double getCgpa() {
        return cgpa;
    }
	
    // Public method to modify CGPA
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value");
        }
    }
}
