package com.constructor.levelone;

public class Course {

	// Attributes
	String courseName;
	int duration;
	double fee;
	
	//Class Variable
	static String instituteName = "ABC Institute";
	
	//constructor
	public Course (String courseName, int duration, double fee) {
		
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
	}
	
	//method to display details
	public void  displayCourseDetails() {
		System.out.println("Institute Name : " + instituteName);
		System.out.println("The course "+ this.courseName);
		System.out.println("The duration "+ this.duration);
		System.out.println("The fee "+ this.fee);
	}
	
	// method updateInstituteName()
	public static void updateInstituteName(String newName) {
		instituteName = newName;
	}
	
}
