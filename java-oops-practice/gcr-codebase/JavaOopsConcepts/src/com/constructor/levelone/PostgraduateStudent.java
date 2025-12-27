package com.constructor.levelone;

//If a parent class has only parameterized constructors,
//the child class MUST explicitly call one of them using super()

public class PostgraduateStudent extends Student{
    
	String specialization;
	
	public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }
	
	public void displayStudentInfo() {
        System.out.println("Roll Number     : " + rollNumber); // public
        System.out.println("Name            : " + name);       // protected
        System.out.println("CGPA            : " + getCgpa());   // private accessed via method
        System.out.println("Specialization  : " + specialization);
    }
}
