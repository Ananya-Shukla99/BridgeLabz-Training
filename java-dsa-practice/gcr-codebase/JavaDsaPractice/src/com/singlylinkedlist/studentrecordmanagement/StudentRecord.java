package com.singlylinkedlist.studentrecordmanagement;

public class StudentRecord {

	// attribute
	int rollNo;
	String name;
	int age;
	char grade;
	StudentRecord next;
	
	//constructor
	StudentRecord(int rollNo, String name, int age, char grade){
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.grade=grade;
	}
}
