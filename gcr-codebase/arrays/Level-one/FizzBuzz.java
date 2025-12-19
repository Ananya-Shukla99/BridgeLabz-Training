//A Program to check for a positive integer , if positive integer, loop and print the number, but for multiples of 3 print "Fizz"
// instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".

import java.util.Scanner;

public class FizzBuzz
{
	public static void main(String []args)
	{
		// getting number from the user
		Scanner input=new Scanner(System.in);
        System.out.println("Enter number :");
        int number = input.nextInt();
		
		//Declaring the array
		String [] array=new String[number];
		int index=0;
		
		//printing positive numbers between 1 to the number from the user input checking there divisibility 
		for(int i=1; i<=number; i++){
		    
			if(i%5==0 && i%3==0){
				array[index]=("FizzBuzz");
				index++;
			}
			else if (i%5==0){
				array[index]=("Buzz");
				index++;
			}
			else if(i%3==0){
				array[index]=("Fizz");
				index++;
			}
			else{
				array[index]=i+"";
				index++;
			}
		}
		
		//printing the result array
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +" , ");
        }
		
		//closing input
		input.close();
	}
}