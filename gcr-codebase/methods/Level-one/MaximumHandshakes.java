//a program to find the maximum number of handshakes among students

import java.util.*;

public class MaximumHandshakes{
    
	//methods for calculating the handshakes
	public int calculateHandshakes(int students){
		
		//calculating the handshakes
		int combination = (students * (students - 1)) / 2;
		
		//return the possible handshakes
		return combination;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of number of students
		System.out.println("Enter th number of students :");
		int students = input.nextInt();
		
		//Creating the object
		MaximumHandshakes handshakes=new MaximumHandshakes();
		
		//Calling the method
		int totalHandshakes=handshakes.calculateHandshakes(students);
     
		//Printing the total handshakes
		System.out.println("The number of possible handshakes :"+ totalHandshakes);
	    
		// Close the Scanner object
        input.close();
	}

}
