package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(101, "Alice", 50000);
        fte.assignDepartment("IT");

        PartTimeEmployee pte = new PartTimeEmployee(102, "Bob", 500, 40);
        pte.assignDepartment("HR");

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("--------------------");
        }
    }
}
