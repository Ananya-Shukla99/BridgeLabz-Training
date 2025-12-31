package com.designprinciples.levelone;

import java.util.ArrayList;
public class Course {

	 private String courseName;
	    private ArrayList<Student> enrolledStudents;

	    public Course(String courseName) {
	        this.courseName = courseName;
	        enrolledStudents = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        enrolledStudents.add(student);
	    }

	    public void showStudents() {
	        System.out.println("Course: " + courseName);
	        for (Student s : enrolledStudents) {
	            System.out.println(" - " + s.getName());
	        }
	    }

	    public String getCourseName() {
	        return courseName;
	    }
}
