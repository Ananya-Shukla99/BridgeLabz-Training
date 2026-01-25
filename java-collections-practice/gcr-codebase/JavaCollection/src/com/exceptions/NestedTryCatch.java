package com.exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {

		try {
			try {
				int[] arr = { 0, 9, 8 };
				int index = 3;

				System.out.println("Value at index " + index + ": " + arr[index]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index!");
				System.out.println("Caught an ArrayIndexOutOfBoundsException : " + e.getMessage());
			}
			try {
				int a = 20;
				int b = 0;
				int result = a / b;
				System.out.println(result);

			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero!");
				System.out.println("ArithmeticException caught : " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Handlling exceptions !");
		}
	}
}
