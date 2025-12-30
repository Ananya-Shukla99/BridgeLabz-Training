//Temperature Logger 
import java.util.Scanner;

public class TemperatureLogger{
	public static void main(String []args){
		
		System.out.println("-----------------------------");
		System.out.println("------Temperature Logger-----");
		System.out.println("-----------------------------");
		
		//creating a Scanner object;
		Scanner sc=new Scanner (System.in);
		
		//Creating array for storing the temprature
		double temprature[]=new double[7];
		
		//Taking user input for temprature
		for(int i=0; i<temprature.length; i++){
			System.out.print("Input the temprature of day "+ (i+1)+" : ");
		    temprature[i]=sc.nextDouble();
		}
		
		System.out.println("-----------------------------");
		System.out.println("--Temperature of the weeks--");
		System.out.println("-----------------------------");
		System.out.println();
		//Stroing average and maximum tempratures
		double average=0.0;
		double sum=0.0;
		double maximum=Integer.MIN_VALUE;
		
		//displaying the tempratures for the week
		for(int i=0; i<temprature.length; i++){
			System.out.print("The temprature of day "+ i);
			System.out.println(temprature[i]);
			
			sum+=temprature[i];
		    if(temprature[i]>maximum){
			    maximum=temprature[i];
		    }
		}
		System.out.println();
		//Displaying the values
		System.out.println("-----------------------------");
		System.out.println("Average temprature : "+(sum/7));
		System.out.println("-----------------------------");
		System.out.println("Maximum temprature : "+maximum);
		System.out.println("-----------------------------");
		
		System.out.println();
		//closing the scanner object
	    sc.close();	
	}
} 