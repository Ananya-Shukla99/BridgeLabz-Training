//A Program to find the factors of a number taken as user input.

import java.util.Scanner;

public class FindTheFactors
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		int maxFactor=10;
		
		// Declare the Array
		int [] arr =new int[maxFactor];
		int index=0;
		
		//printing factorial using for loop the number from the user input 
		for(int i=1; i<=number; i++){
		    if(number%i==0){
			    
				if(index<maxFactor-1){
				    arr[index]=i;
				    index++;
				}
				else{
					int []temp = arr;
					maxFactor*=2;
					arr=new int[maxFactor];
					for(int j=0;j<temp.length;j++){
						arr[j] = temp[j];
					}
					arr[index]=i;
				    index++;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0){
				break;
			}
			System.out.print(arr[i]+" ");

		}
		input.close();
	}
}