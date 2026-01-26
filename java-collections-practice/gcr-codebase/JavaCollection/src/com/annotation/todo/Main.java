package com.annotation.todo;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		ProjectFeatures project = new ProjectFeatures();
		project.login();
		project.search();
		project.payment();
		project.helper();

		Method[] methods = ProjectFeatures.class.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(Todo.class)) {
				Todo todo = method.getAnnotation(Todo.class);
				System.out.println("Pending Task: " + todo.task());
				System.out.println("Assigned To: " + todo.assignedTo());
				System.out.println("Priority: " + todo.priority());
				System.out.println("Method: " + method.getName());
				System.out.println();
			}
		}
	}
}
