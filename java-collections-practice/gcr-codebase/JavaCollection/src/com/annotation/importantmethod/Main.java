package com.annotation.importantmethod;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		ProjectTasks tasks = new ProjectTasks();
		tasks.deployApp();
		tasks.runTests();
		tasks.cleanup();

		Method[] methods = ProjectTasks.class.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
				System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
			}
		}
	}
}