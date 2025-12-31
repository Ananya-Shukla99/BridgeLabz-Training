package com.designprinciples.levelone;

import java.util.ArrayList;
public class Company 
{

	private String companyName;
	private ArrayList<Department>departments;
	
	public Company(String companyName) {
		this.companyName=companyName;
		departments=new ArrayList<>();
	}
	
	public void showDepartments() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
        System.out.println();
    }

	public void addDepartment(String deptName) {
		departments.add(new Department(deptName));
	}
	
	public void closeCompany () 
	{
		departments.clear(); 
        System.out.println(companyName + " is closed.");

	}
}
