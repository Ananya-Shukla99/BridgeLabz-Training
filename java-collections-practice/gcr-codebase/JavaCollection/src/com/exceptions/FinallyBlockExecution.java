package com.exceptions;

import java.util.Scanner;

public class FinallyBlockExecution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number: ");
			int num = sc.nextInt();
			System.out.println("Enter second number: ");
			int num2 = sc.nextInt();

			int result = num / num2;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught : " + e.getMessage());
		} finally {
			System.out.println("Operation completed");
			sc.close();
		}
	}
}
