//A calculator using switch case.

import java.util.Scanner;

public class Calculator{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting numbers and operation from the user
		System.out.println("Enter first:");
	    double first=input.nextDouble();
		System.out.println("Enter second :");
		double second =input.nextDouble();
		System.out.println("Enter operation :");
		String operation =input.nextLine();
		
		
		//Calculation
		switch(operation){
			case"+"{
				System.out.println("Sum of numbers is :"+ (first+second));
				break;
			}
			case"-"{
				System.out.println("Subtraction of numbers is :"+ (first-second));
				break;
			}
			case"*"{
				System.out.println("Multiplication of numbers is :"+ (first*second));
			    break;

			}
			case"/"{
				System.out.println("Division of numbers is :"+ (first/second));
				break;
			}
		
		}
		input.close();
	}
}
