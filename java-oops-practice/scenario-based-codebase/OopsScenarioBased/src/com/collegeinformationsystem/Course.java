package com.collegeinformationsystem;

import java.util.*;

public class Course {

	//attributes
	private String courseName;
    private Faculty facultyName;
	private ArrayList<Student> students;
	
	
	//constructor
	Course(String courseName, Faculty facultyName){
		this.courseName=courseName;
		this.facultyName=facultyName;
		students=new ArrayList<>();
	}

    //getter
	public String getCourseName() {
		return courseName;
	}
	public Faculty getfaculty() {
		return facultyName;
	}
	//adding student method
	public void addStudent(Student s) {
		students.add(s);
	}
	
	//removing student 
	public void removeStudent(Student s) {
		students.remove(s);
	}
}
