// a program to Quadratic to find the roots of the equation

import java.util.*;

public class FindTheRoots
{
    //method to find delta
    public static int findDelta(int a, int b, int c)
	{
	   int delat = Math.pow(b,2) +(4*a*c);
	   
	   //return the delta
	   return delta;
	}
	
	//method to find the roots
    public static int[] findRoot(int delta, int a, int b)
	{
	    //creating the array
		int arr[]=new int[2];
		
	    if(delta ==0){
			arr[0]=-(b)/(2*a);
			arr[1]=0;
	    }
		else if(delta>0){
			arr[0]= (-b + delta)/(2*a);
			ar[1]= (-b - delta)/(2*a);
		}
		else{
			arr[0]=0;
			arr[1]=0;
		}
	   return arr;
	}
    
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the a :");
		int a = input.nextInt();
		System.out.println("Enter the b :");
		int b = input.nextInt();
		System.out.println("Enter the c :");
		int c = input.nextInt();
		
		//Calling the method
		int delts=findDelta(a,b,c);
		int [] arr=findRoots(delta,a,b);
		
		//Printing the value
		for(int i=0; i<arr.length; i++){
			System.out.println("The root value is "+a[i]);
		}

		// Close the Scanner object
        input.close();
	}

}
