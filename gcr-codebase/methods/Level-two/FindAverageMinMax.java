// a program that generates five 4 digit random values and
// then finds their average value, and their minimum and maximum value

import java.util.*;

public class FindAverageMinMax
{
    //method to find average Min Max
    public static double[] findAverageMinMax(int arr[])
	{
		double sum=0;
		int min=arr[0];
		int max=arr[0];
		
		for(int num:arr){
			
			sum+=num;
			min=Math.min(min, num);
			max=Math.max(max, num);
		}
		
		double average=sum /arr.length();
		return new double[]{average , min, max};
	}
	
	//method to generate numbers
    public static int[] generate4DigitRandomArray(int size)
	{
		int number[]=new int [size];
		
		for(int i=0;i< size;i++){
			number[i]=(int) (Math.random() * 9000)+1000;
		}
	    
	   return numbers;
	}
    
	public static void main(String[]args){
		
		//Generating 5 random numbers of 4 digit
		int []random= generate4DigitRandomArray(5);
		
		// Display generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : random)
            System.out.print(num + " ");
        }
		
		// Find average, min, and max
        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);

		// Close the Scanner object
        input.close();
	}
}

.