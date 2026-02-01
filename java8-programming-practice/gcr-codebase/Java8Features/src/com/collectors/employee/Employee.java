package com.collectors.employee;

public class Employee {

	String name;
	private Double salary;
	private String department;

	public Employee(String name, Double salary, String department) {

		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	public Double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

}
