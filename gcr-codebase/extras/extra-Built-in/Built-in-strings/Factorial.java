// a program to find factorial
import java.util.*;

public class Factorial{
	
	public static int factorial(int n, int ans){
		
		if(n==1){
		    return ans;
		}
		return factorial(n-1, ans*n);
		
	}
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number= sc.nextInt();
		
		int ans=1;
		//calling the function
		int fact=factorial(number, ans);
		
		System.out.println(fact);
		sc.close();
	}
	
}