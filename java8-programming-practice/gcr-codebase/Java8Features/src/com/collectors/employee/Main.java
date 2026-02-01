package com.collectors.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[]args) {
		
		Employee emp1 = new Employee("Rahul Sharma", 75000.0, "Engineering");
        Employee emp2 = new Employee("Priya Verma", 60000.0, "HR");
        Employee emp3 = new Employee("Amit Patel", 85000.0, "Finance");
        Employee emp4  = new Employee("Suresh Kumar", 70000.0, "Engineering");
        Employee emp5  = new Employee("Neha Singh", 65000.0, "HR");
        Employee emp6  = new Employee("Rohit Mehta", 90000.0, "Finance");
        Employee emp7  = new Employee("Anjali Iyer", 80000.0, "Engineering");
        Employee emp8  = new Employee("Vikram Rao", 72000.0, "Operations");
        Employee emp9  = new Employee("Pooja Nair", 68000.0, "HR");
        Employee emp10 = new Employee("Karan Malhotra", 95000.0, "Finance");

        List<Employee> employees=Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
        
        Map<String, Double> avgSalary = employees.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment,
        		Collectors.averagingDouble(Employee::getSalary)));
        
        avgSalary.forEach((d, s)-> System.out.println(d +" : "+ s));
	}

}
