//A Program to check for a positive integer , if positive integer, loop and print the number, but for multiples of 3 print "Fizz"
// instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
import java.util.Scanner;
public class FizzBuzz
{
	public static void main(String []args)
	{
		// getting number from the user
		Scanner input=new Scanner(System.in);
        System.out.println("Enter number :");
        int number = input.nextInt();
		
		//printing positive numbers between 1 to the number from the user input checking there divisibility 
		for(int i=1; i<=number; i++){
		    if(i%3==0){
				System.out.println("Fizz");
			}
			else if (i%5==0){
				System.out.println("Buzz");
			}
			else if(i%5==0 && i%3==0){
				System.out.println("FizzBuzz");
			}
			else{
				System.out.println(i);
			}
		}
		input.close();
	}
}