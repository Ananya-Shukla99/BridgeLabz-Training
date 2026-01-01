package com.Inheritance.leveltwo;

public class PersonMain {

	 public static void main(String[] args) {
	        Teacher teacher = new Teacher("Mr. Kumar", 40, "Mathematics");
	        Student student = new Student("Anita", 16, "10th Grade");
	        Staff staff = new Staff("Ramesh", 35, "Administration");

	        teacher.displayRole();
	        student.displayRole();
	        staff.displayRole();
	 }
}
