// a program to find fibonacci sequence
import java.util.*;

public class FibonacciSequence{
	
	public static int[] fibonacci(int number){
		
		int ans[]=new int[number];
		int first=0;
	    int second=1;
		for(int i=0;i<number;i++){
			ans[i]=first;
			int next =first+second;
			first=second;
		    second=next;
		}
		return ans;
	}
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number= sc.nextInt();
		
		//calling the function
		int []arr=fibonacci(number);
		
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
	
}