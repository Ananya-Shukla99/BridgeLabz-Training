package com.designprinciples.levelone;

public class CompanyMain {

	public static void main(String[] args) {

        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.showDepartments();
        company.closeCompany(); 
    }
}
