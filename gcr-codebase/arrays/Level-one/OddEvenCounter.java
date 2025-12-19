//A program to store even or odd numbers in array.

import java.util.Scanner;

public class OddEvenCounter
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter number : ");
		int number=input.nextInt();
		
		// Declare the Array
		int [] odd =new int[number];
		int [] even =new int[number];
        
		//Declaring index
		int oddIndex=0;
		int evenIndex=0;
		
		//finding the number is even or odd
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0){
				odd[oddIndex]=i;
				oddIndex++;
			}
			else {
			    even[evenIndex]=i;
				evenIndex++;
			}
		}
		oddIndex--;
		evenIndex--;
		//printing array
		System.out.print("Odd array :");
		for(int i=0;i<oddIndex;i++)
		{
			System.out.print( odd[i]+" ");

		}
		System.out.print("Even array :");
		for(int i=0;i<=evenIndex;i++)
		{
			System.out.print(even[i]+" ");

		}
		
		// Close the Scanner Object
        input.close();
	}
}