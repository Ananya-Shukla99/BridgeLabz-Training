package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[]args) {
		
		try {
			int a=20;
			int b=0;
			int result = a/b;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught : "+ e.getMessage());
		}
		Scanner sc=new Scanner(System.in);

		try {
			System.out.println("Enter your name : ");
			int num=sc.nextInt();
			System.out.println("You entered : "+num);
			
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input! Please enter only integer values.");
	    }
		finally {
			sc.close();
		}
	}
}
