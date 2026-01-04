package com.universitycourseenrollmentsystem;

class Enrollment {
	
	// Private fields - data encapsulation
    private Student student;
    private Course course;

    //constructor
    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    //getter for student 
    public Student getStudent() {
        return student;
    }
    
    //method for course
    public Course getCourse() {
        return course;
    }
    
    //method to display info 
    public void show() {
    	System.out.println("Student " + student +"course "+course);
    }
}
