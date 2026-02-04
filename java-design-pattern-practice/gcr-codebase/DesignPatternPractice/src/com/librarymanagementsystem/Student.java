package com.librarymanagementsystem;

public class Student implements User, Observer {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void showRole() {
		System.out.println(name + " is a Student.");
	}

	public void update(String bookName) {
		System.out.println(name + " notified " + bookName +" is now available ");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
