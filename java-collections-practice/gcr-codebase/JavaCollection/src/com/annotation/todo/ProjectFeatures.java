package com.annotation.todo;

public class ProjectFeatures {

	@Todo(task = "Implement login feature", assignedTo = "Ananya", priority = "HIGH")
	public void login() {
		System.out.println("Login feature is pending...");
	}

	@Todo(task = "Add search functionality", assignedTo = "Bhanu")
	public void search() {
		System.out.println("Search feature is pending...");
	}

	@Todo(task = "Integrate payment gateway", assignedTo = "Ravi", priority = "HIGH")
	public void payment() {
		System.out.println("Payment feature is pending...");
	}

	public void helper() {
		System.out.println("Helper method, no pending task.");
	}
}
