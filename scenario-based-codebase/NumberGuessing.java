//The Number Guessing Game 
import java.util.*;

public class NumberGuessing{
	public static void main(String[] args) {
		//creating a Scanner object
	Scanner sc=new Scanner (System.in);
	int count=5;
	int actualNumber=99;
    do{
		System.out.println("Guess a number :");
		int number=sc.nextInt();
		
		if(number==actualNumber){
		    System.out.println("Correct Guess");	
			break;
		}		
		else if(number>actualNumber){
			System.out.println("Too Big");
		}
		else{
			System.out.println("Too Small");
		}
		count--;
	}while(count>=0);
		
	}
}