// a program to calculate various trigonometric functions 

import java.util.*;

public class TrigonometricFunctions
{
    //method to find TrigonometricFunctions
    public double[] calculateTrigonometricFunctions(double angle)
	{
	    //creating a array
		double [] arr=new double[3];
		
		//find th value
		arr[0]=Math.sine(angle);
		arr[1]=Math.cos(angle);
		arr[2]=Math.tan(angle);

		//return array
		return arr;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the angle :");
		int angle  = input.nextInt();
		
		//Calling the method
		int [] arr=calculateTrigonometricFunctions(angle);

     
		//Printing the value
		System.out.println("The sine value is "+arr[0]);
		System.out.println("The cosine value is  "+arr[1]);
		System.out.println("The tangent value is "+arr[2]);
		
		// Close the Scanner object
        input.close();
	}

}

