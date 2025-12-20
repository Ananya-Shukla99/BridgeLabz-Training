//a program to find the sum of n natural numbers using 
//recursive method and compare the result with the formulae

import java.util.*;

public class CompareNaturalSum
{
    //method to find recursive sum 
    public static int recursiveSum(int number, int sum)
	{
		if(number<=0){
			
			return sum;
		}
		sum=sum+number;
        return recursiveSum( number-1 , sum);
	}
    
	//method to find the sum using formula
    public static int formulaSum(int number)
	{
	    
		//calculating the sum
		int result= number*(number+1)/2;
		
		//returning the result
        return result;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the number :");
		int number = input.nextInt();
		int sum=0;
		
		//Calling the method
		int sum1 =recursiveSum(number, sum);
		int sum2 =formulaSum(number);

		//Comparing the values
		if(sum1==sum2){
			System.out.println("The output is equal");
		}
		else{
			System.out.println("The values are not equal");
		}
		
		// Close the Scanner object
        input.close();
	}

}