package com.constructor.levelone;

public class Manager extends Employee{

	String managerLevel;

    // Constructor
    public Manager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    // Method demonstrating access to public and protected members
    public void displayManagerDetails() {
        System.out.println("Employee ID  : " + employeeID);   // public
        System.out.println("Department   : " + department);   // protected
        System.out.println("Salary       : " + getSalary());  // private via method
        System.out.println("Manager Level: " + managerLevel);
    }
}
