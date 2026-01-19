package com.sortingalgorithms.eduresults;

import java.util.*;

public class District {

	//List of students
	public String name;
	protected ArrayList<Student> list=new ArrayList<>();
	
	//constructor
	District(String name, ArrayList<Student> list){
		this.name=name;
		this.list=list;
	}
	
	public void addStudent(Student s) {
		list.add(s);
	}
	
}
