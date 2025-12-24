// a program to find prime number
import java.util.*;

public class PrimeNumber{
	
	public static boolean isPrime(int number){
		
		if(number<=1){
			return false;
		}
		if(number ==2){
			return true;
		}
		if (number % 2 == 0) {
            return false;
        }
		for(int i=3; i<=Math.sqrt(number);i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number= sc.nextInt();
		
		//calling the function
		boolean flag=isPrime(number);
		
		if(flag){
			System.out.println("The number is prime ");
		}
		else{
			System.out.println("This is not a prime number");
		}

		sc.close();
	}
	
}