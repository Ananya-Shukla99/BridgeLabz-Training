package com.methodreferences.HRletter;

import java.util.ArrayList;
import java.util.List;

public class HRLetter {

	public static void main(String[]args) {
		
		//Create Employee object
		Employee e= new Employee("Ram", 101);
		Employee e2= new Employee("suman", 102);
		Employee e3= new Employee("eva", 103);
		Employee e4= new Employee("Ram", 104);
		Employee e5= new Employee("Ram", 105);
		
		// List of Employee
		List<Employee>list=new ArrayList<>();
		list.add(e);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//Using stream we convert lower case to upper case
		list.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
	}
}
