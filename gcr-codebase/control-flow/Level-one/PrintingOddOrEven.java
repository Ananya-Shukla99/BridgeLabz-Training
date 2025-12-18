//A Program to find odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
public class PrintingOddOrEven
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number :");
        int number = input.nextInt();
		
		//printing odd and even numbers between 1 to the number from the user input 
		for(int i=1; i<=number; i++){
		    if(i%2==0){
				System.out.println(i+" is a even number");
			}
			else{
				System.out.println(i+" is a odd number");
			}
		}
		input.close();
	}
}