package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

public class CollegeCourse {

	 private String courseName;
	    private Professor professor;            
	    private List<CollegeStudent> students;          

	    public CollegeCourse(String courseName) {
	        this.courseName = courseName;
	        students = new ArrayList<>();
	    }

	    public void addStudent(CollegeStudent student) {
	        students.add(student);
	    }

	    public void setProfessor(Professor professor) {
	        this.professor = professor;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void showCourseDetails() {
	        System.out.println("\nCourse: " + courseName);

	        if (professor != null) {
	            System.out.println("Professor: " + professor.getName());
	        }

	        System.out.println("Enrolled Students:");
	        for (CollegeStudent s : students) {
	            System.out.println("- " + s.getName());
	        }
	    }
}
