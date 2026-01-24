package com.collections.mapinterface.groupobject;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Department d = new Department("HR");
		Department d2 = new Department("IT");
		
		Employee e = new Employee("Alice", d);
		Employee e2 = new Employee("Carol", d);
		Employee e3 = new Employee("Bhuv", d);
		Employee e5 = new Employee("Shubham", d2);
		Employee e4 = new Employee("Riya", d2);
		
		List <Employee> list= new  ArrayList<>();
		list.add(e);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("List of employee : ");
		System.out.println(list);
		System.out.println();
		
		HashMap<Department, List<Employee>> map = new HashMap<>();

		map.put(d, d.list);
		map.put(d2, d2.list);
		
		System.out.println("Grouping employee by department using a map : ");
		System.out.println(map);
		
	}
}
