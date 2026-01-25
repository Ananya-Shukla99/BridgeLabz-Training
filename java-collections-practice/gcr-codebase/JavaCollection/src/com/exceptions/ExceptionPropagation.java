package com.exceptions;

import java.util.Scanner;

public class ExceptionPropagation {

	//method 1
	public static double division(int first, int second)throws  ArithmeticException{
		if(second<=0|| first <=0) {
			throw new  ArithmeticException("ArithmeticException dividing by "+ second);
		}
		else {
			return first/second;
		}
	}
	//method 2
    public static double method2(int first, int second) {
        return division(first, second); 
    }

	//main
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
	    try{System.out.println("Enter two numbers :");
			int first=sc.nextInt();
			int second=sc.nextInt();
			System.out.println(method2 (first, second));
	    }catch(ArithmeticException e) {
	    	System.out.println("Handled exception in main");
	    	System.out.println(e.getMessage());
	    }
	    finally {
	    	sc.close();
	    }
	}
}
