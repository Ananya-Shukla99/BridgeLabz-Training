// Festival Lucky Draw 
import java.util.*;

public class LuckyDraw
{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome To Festival Lucky Draw  ");
		System.out.println("You want try your luck?(Yes/No)");
		String response=sc.next();
		
		do{
			System.out.println("Pick a number from the box!!! :");
			int input=sc.nextInt();
			
			System.out.println("Let's see are you lucky or not !!!");
			
			if(input%3==0 && input%5==0){
				System.out.println("Congratulations! You won a gift ");
			}
			else{
				System.out.println("Sorry! Better Luck next time ");
			}
			System.out.println("Do you want try your luck? (Yes/No)");
            response = sc.next();
			
		}while(response.equals("Yes"));
		
		System.out.println("Thank You for Using Our Services ");
	}
	
}