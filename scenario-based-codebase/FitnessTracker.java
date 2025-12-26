// Maya’s BMI Fitness Tracker

import java.util.*;

public class FitnessTracker{
	
	public static void main(String[]args){
		//created a scanner class
	    Scanner sc=new Scanner(System.in);
	
	    //taking user input of weight and height
		System.out.println("Input your height :");
		double height=sc.nextDouble();
		System.out.println("Input your weight:");
		double weight=sc.nextDouble();
		
		//calculating the BMI
		double BMI=weight / (height * height);
		
		//Using if else to find the status
		if (BMI<=18.4) {
            System.out.println("Underweight");
        }
        else if (BMI>=18.5 && BMI<=24.9) {
            System.out.println("Normal");
        }
		else if(BMI>=25.0 && BMI<=39.9){
			 System.out.println("Overweight");
		}
		else {
            System.out.println("Obese");
		}
		sc.close();
	}
}