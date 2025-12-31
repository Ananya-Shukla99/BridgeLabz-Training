package com.designprinciples.levelone;

import java.util.ArrayList;
public class Department
{

	String departmentName;
	private ArrayList<Employee>employee;
	
    public Department(String departmentName) {
    	this.departmentName=departmentName;
    	employee=new ArrayList<>();
    }	
    
    public void showEmployees() {
        System.out.println(" Department: " + departmentName);
        for (Employee emp : employee) {
            emp.showEmployee();
        }
    }
    public void addEmpolyee(String empName) {
    	employee.add(new Employee(empName));
    }
}
