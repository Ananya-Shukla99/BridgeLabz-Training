package com.constructor.levelone;

public class EmployeeMain {

	 public static void main(String[] args) {

	    Manager m = new Manager(501, "IT", 75000, "Senior Manager");

	    m.displayManagerDetails();

	    // Modify salary
	    m.setSalary(82000);
	    System.out.println("Updated Salary: " + m.getSalary());
	}
}
