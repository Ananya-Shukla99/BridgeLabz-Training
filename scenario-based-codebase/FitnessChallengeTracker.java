// Sandeep’s Fitness Challenge Tracker 

import java.util.Scanner;

public class FitnessChallengeTracker
{
	public static void main(String []args){
		
		System.out.println("------------------------------------");
		System.out.println("------Fitness Challenge Tracker-----");
		System.out.println("------------------------------------");
		
		//creating a Scanner object;
		Scanner sc=new Scanner (System.in);
		
		//Creating array for storing number of push ups
		int PushUps[]=new int[7];
		
		//Taking user input for PushUps
		for(int i=0; i<PushUps.length; i++){
			System.out.print("Input the PushUps of day "+ (i+1)+" : ");
		    PushUps[i]=sc.nextInt();
		}
		
		System.out.println("-----------------------------");
		System.out.println("---Push Ups for the weeks---");
		System.out.println("-----------------------------");
		System.out.println();
	
		//Stroing average and maximum tempratures
		int sum=0;
		int maximum=Integer.MIN_VALUE;
		
		//displaying the PushUps for the week
		for(int i=0; i<PushUps.length; i++){
			System.out.print("Number of push ups on "+ i+": ");
			if(PushUps[i]==0){
			    System.out.println("Rest Day");
			}
			else{
			    System.out.println(PushUps[i]);
			}
			
			sum+=PushUps[i];
		    if(PushUps[i]>maximum){
			    maximum=PushUps[i];
		    }
		}
		System.out.println();
		//Displaying the values
		System.out.println("-----------------------------");
		System.out.println("Average PushUps: "+(sum/7));
		System.out.println("-----------------------------");
		System.out.println("Maximum PushUps : "+maximum);
		System.out.println("-----------------------------");
		
		System.out.println();
		//closing the scanner object
	    sc.close();	
	}
} 