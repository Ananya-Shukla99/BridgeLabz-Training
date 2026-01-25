package com.javastreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

	@SuppressWarnings("unchecked")	
	public static void main(String[] args) {

		String fileName = "employees.dat";

		// Create employee list
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Ananya", "IT", 55000));
		employees.add(new Employee(102, "Rahul", "HR", 48000));
		employees.add(new Employee(103, "Sneha", "Finance", 62000));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

			oos.writeObject(employees);
			System.out.println("Employee data saved successfully.");

		} 
		catch (IOException e) {
			//System.out.println("Error while saving employee data.");
			 e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

			List<Employee> savedEmployees = (List<Employee>) ois.readObject();

			System.out.println("Employee Details from File:");
			for (Employee emp : savedEmployees) {
				System.out.println(emp);
			}

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error while reading employee data.");
		}
	}
}
