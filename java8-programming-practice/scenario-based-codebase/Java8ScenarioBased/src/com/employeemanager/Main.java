package com.employeemanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Alice", 28, "Female", "HR", 2019, 45000));
		employees.add(new Employee(2, "Bob", 32, "Male", "IT", 2018, 60000));
		employees.add(new Employee(3, "Charlie", 26, "Male", "Finance", 2021, 40000));
		employees.add(new Employee(4, "Diana", 35, "Female", "Marketing", 2016, 55000));
		employees.add(new Employee(5, "Ethan", 29, "Male", "IT", 2020, 48000));
		employees.add(new Employee(6, "Fiona", 31, "Female", "HR", 2017, 52000));
		employees.add(new Employee(7, "George", 40, "Male", "Operations", 2014, 65000));
		employees.add(new Employee(8, "Hannah", 27, "Female", "Finance", 2022, 42000));
		employees.add(new Employee(9, "Ian", 34, "Male", "Sales", 2015, 58000));
		employees.add(new Employee(10, "Julia", 30, "Female", "IT", 2019, 50000));
		employees.add(new Employee(11, "Kevin", 25, "Male", "Product Development", 2022, 46000));
		employees.add(new Employee(12, "Laura", 33, "Female", "Product Development", 2018, 62000));
		employees.add(new Employee(13, "Michael", 38, "Male", "IT", 2015, 70000));
		employees.add(new Employee(14, "Nina", 29, "Female", "Marketing", 2020, 48000));
		employees.add(new Employee(15, "Oliver", 41, "Male", "Finance", 2013, 68000));
		employees.add(new Employee(16, "Paula", 26, "Female", "Product Development", 2023, 44000));
		employees.add(new Employee(17, "Quentin", 35, "Male", "Sales", 2017, 60000));
		employees.add(new Employee(18, "Rachel", 32, "Female", "HR", 2019, 54000));
		employees.add(new Employee(19, "Steve", 28, "Male", "Operations", 2021, 50000));
		employees.add(new Employee(20, "Tina", 37, "Female", "IT", 2016, 66000));
		employees.add(new Employee(21, "Aman", 28, "Female", "Sales", 2019, 45000));
		employees.add(new Employee(22, "Boby", 32, "Male", "Sales", 2018, 60000));

		// 1. How many male and female employees are there in the organization ?
		System.out
				.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		
		System.out.println("----------------------------------------------------------------------------------------");

		// 2. Print the name of all departments in the organization
		employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		System.out.println("----------------------------------------------------------------------------------------");

		// 3. What is the average age of male and female employees
		System.out.println(employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

		System.out.println("----------------------------------------------------------------------------------------");

	    // 4.. Get the details of highest paid employee in the organization 
		System.out.println(employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());
		
		System.out.println("----------------------------------------------------------------------------------------");

		//5 Get the names of all employees who have joined after 2015 
		employees.stream().filter(x->x.getYearOfJoining()>2015).forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------------------------");

		//6.  Count the number of employees in each department ?
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//7. What is the average salary of each department 
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getSalary))));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//8.Get the details of youngest male employee in the IT department ?
		System.out.println(employees.stream().filter(x->x.getGender().equals("Male")).filter(x->x.getDepartment().equals("IT")).min(Comparator.comparingInt(Employee::getAge)).get());
		
		System.out.println("----------------------------------------------------------------------------------------");

		//9. Who has the most working experience in the organization
		System.out.println(employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get());
		
		System.out.println("----------------------------------------------------------------------------------------");

		//10. How many male and female employees are there in the Sales team?
		System.out.println(employees.stream().filter(x->x.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//11.What is the average salary of male and female employees 
		
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//12. List down the names of all employees in each department 
		
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList()))));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//13.What is the average salary and total salary of the whole organization
		System.out.println("total salary of the whole organization: ");
		System.out.println(employees.stream().mapToDouble(Employee::getSalary).sum());
		
		System.out.println("Average salary of the whole organization: ");
		System.out.println(employees.stream().mapToDouble(Employee::getSalary).average().orElse(0));
		
		System.out.println("----------------------------------------------------------------------------------------");

		// 14. Get the employee whose salary are more than 50k.
	    employees.stream().filter(x->x.getSalary()>50000).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------------------");

		//15.Who is the highest paid employee in the organization?
		System.out.println(employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());
		
		System.out.println("----------------------------------------------------------------------------------------");

		//16.Who is the second highest paid employee in the organization
		System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//17.Who is the third highest paid employee in the organization
		System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst().orElse(null));
		
		System.out.println("----------------------------------------------------------------------------------------");

		//18.Who is the lowest paid employee in the organization?
		
		System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst().orElse(null));
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		//19.Who is the second lowest paid employee in the organization
		System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().orElse(null));

		System.out.println("----------------------------------------------------------------------------------------");

		// 20.Get the first five lowest paid employee in the organization

		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(5)
				.forEach(System.out::println);

		System.out.println("----------------------------------------------------------------------------------------");

		//21.Get the first five highest paid employee in the organization?

		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5)
		.forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
