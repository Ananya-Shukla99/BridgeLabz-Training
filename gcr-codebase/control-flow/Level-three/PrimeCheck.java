//A program to prime check
 
import java.util.Scanner;

public class PrimeCheck
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number :");
        int number = input.nextInt();
		
		//checking prime or not 
		if(number <=1){
			System.out.println("The number is not prime");
		}
		else{
		    boolean isPrime = true;
			for(int i=2;i<=Math.sqrt(number); i++){
				if(number%i==0){
				    isPrime = false;
                    break;
				}
			}
		    if (isPrime) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
		
		input.close();
	}
}