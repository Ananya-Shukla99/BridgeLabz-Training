//calculating Maximum handshakes of students using methods

import java.util.Scanner;

public class TotalRounds{

	//method for calculating rounds for 5 km run
	public double calculateTotalRoundsfor5KM(int side1, int side2, int side3){
	
	    //calculating the perimeter
		int perimeter = side1+side2+side3;
		
		//calculating the rounds
		double rounds = 5000/perimeter;
		double totalRounds = Math.ceil(rounds);
		
		//return the total Rounds
		return totalRounds;
	}
	
	
	public static void main(String []args){
	
	    //Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking three sides of triangle
		System.out.print("Enter side1: ");
		int side1 = input.nextInt();
		
		System.out.print("Enter side2: ");
		int side2 = input.nextInt();
		
		System.out.print("Enter side3: ");
		int side3 = input.nextInt();
		
		//Creating object 
		TotalRounds obj = new TotalRounds();
		
		//calling the method
		double totalRounds = obj.calculateTotalRoundsfor5KM(side1,side2,side3);
		
		//printing the Maximum Handshakes of students
		System.out.println("Total rounds to cover 5 Km : "+totalRounds);
		
		//closing the scanner
		input.close();
	}
}