package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {

			Class<?> cls = Class.forName("com.reflection.MathOperations");
			Object obj = cls.getDeclaredConstructor().newInstance();

			System.out.print("Enter method name (add / subtract / multiply): ");
			String methodName = sc.nextLine();

			System.out.print("Enter first number: ");
			int a = sc.nextInt();

			System.out.print("Enter second number: ");
			int b = sc.nextInt();

			Method method = cls.getMethod(methodName, int.class, int.class);

			int result = (int) method.invoke(obj, a, b);

			System.out.println("Result: " + result);

		} catch (NoSuchMethodException e) {
			System.out.println("Invalid method name!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
