package com.designprinciples.levelone;

import java.util.ArrayList;
public class School {

	 private String schoolName;
	    private ArrayList<Student> students;

	    public School(String schoolName) {
	        this.schoolName = schoolName;
	        students = new ArrayList<>();
	    }

	    // Add student to school
	    public void addStudent(Student student) {
	        students.add(student); // aggregation: student exists independently
	    }

	    public void showStudents() {
	        System.out.println("School: " + schoolName);
	        for (Student s : students) {
	            System.out.println(" - " + s.getName());
	        }
	    }
}
