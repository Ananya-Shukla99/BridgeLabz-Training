package com.testing;

public class MathUtils {

	public static int divide(int a, int b) {
		
		if(b==0) {
			throw new ArithmeticException("Dividing by zero is not allowed");
		}
		return a/b;
	}
}
