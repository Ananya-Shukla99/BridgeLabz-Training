package com.Inheritance.levelone;

public class EmployeeMain {

	public static void main(String[] args) {
        Employee e1 = new Manager("Amit", 101, 80000, 5);
        Employee e2 = new Developer("Riya", 102, 60000, "Java");
        Employee e3 = new Intern("Rahul", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        
    }
}
