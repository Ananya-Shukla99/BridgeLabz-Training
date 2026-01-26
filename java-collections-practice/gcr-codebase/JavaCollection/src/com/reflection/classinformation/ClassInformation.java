package com.reflection.classinformation;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInformation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter class name: ");
		String className = sc.nextLine();

		try {
			Class<?> cls = Class.forName(className);

			System.out.println("\nConstructors:");
			for (Constructor<?> c : cls.getConstructors()) {
				System.out.println("  " + c.getName());
			}

			System.out.println("\nMethods:");
			for (Method m : cls.getMethods()) {
				System.out.println("  " + m.getName());
			}

			System.out.println("\nFields:");
			for (Field f : cls.getFields()) {
				System.out.println("  " + f.getName());
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		finally {
			sc.close();
		}
	}
}