// a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
// Also find the sum, sum of square of factors and product of the factors and display the results

import java.util.*;

public class FindTheFactors
{
    //method to count the factors
    public static int factorsCount(int number)
	{
	    int count=0;
		for(int i=1;i<=number;i++){
			
			if(number%i==0){
				count++;
			}
		
		}
        return count;
	}
    
	//method to store the factors
    public static int[] factors(int number, int count)
	{
	    
		int result[]=new int[count];
		int index=0;
		for(int i=1;i<=number;i++){
			
			if(number%i==0){
				result[index]=i;
				index++;
			}
		
		}
        return result;
	}
	
	//method to find product
    public static int productFind(int []arr)
	{
	    int product=1;
		for(int i=0;i<arr.length;i++){
			
			product*=arr[i];
		}
        return product;
	}
	
	//method to find sum
    public static int sumFind(int []arr)
	{
	    int sum=0;
		for(int i=0;i<arr.length;i++){
			
			sum+=arr[i];
		}
        return sum;
	}
	
	//method to find square sum
    public static int sumSquareFind(int []arr)
	{
	    int sumSquare=0;
		for(int i=0;i<arr.length;i++){
			
			sumSquare+=Math.pow(arr[i],2);
		}
        return sumSquare;
	}
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the number :");
		int number = input.nextInt();
		
		//Calling the method
		int count=factorsCount(number);
		int [] arr=factors(number , count);
		int product=productFind(arr);
		int sum=sumFind(arr);
		int sumSquare=sumSquareFind(arr);

		//Printing the value
		for(int i=0; i<arr.length; i++){
			System.out.println("The factor value is "+arr[i]);
		}
		System.out.println("The sum of array "+sum);	
		System.out.println("The product of array "+product);		
		System.out.println("The sumSquare of array "+sumSquare);		
		

		// Close the Scanner object
        input.close();
	}

}