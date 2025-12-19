//A program to take user input for the age of all 10 students in a class and check whether the student can vote

import java.util.Scanner;

public class VoterList
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		// Declare the Array
		int [] arr =new int[10];

        // Input the elements of the Array
        System.out.println("Enter the ages of the students : ");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=input.nextInt();
		}
        
		//finding the number of student elegible for voting
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0){
				System.out.println("Invalid age ");
			}
			else if(arr[i]>=18){
				System.out.println("The student with the age "+arr[i]+" can vote");
			}
			else {
			    System.out.println("The student with the age "+arr[i]+" cannot vote");
			}
		}
		
		// Close the Scanner Object
        input.close();
	}
}
