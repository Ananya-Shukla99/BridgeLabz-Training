package com.schoolsystem;

public class Student {

	private String name;
	private int age;
	private int rank;
	private int marks;

	public Student(String name, int age, int rank, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}
//
//	public Optional<String> getName(){
//		return Optional.ofNullable(name);
//	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
//	public Optional<Integer> getAge(){
//		return Optional.ofNullable(age);
//	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public int getRank(){
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rank=" + rank + ", marks=" + marks + "]";
	}

}
