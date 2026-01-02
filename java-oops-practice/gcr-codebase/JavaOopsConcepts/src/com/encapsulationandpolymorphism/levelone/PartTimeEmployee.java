package com.encapsulationandpolymorphism.levelone;

public class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursWorked;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}