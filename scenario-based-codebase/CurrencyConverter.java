// Currency Exchange Kiosk
import java.util.*;

public class CurrencyConverter
{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome To Currency Converter ");
		System.out.println("You want conversion ?(Yes/No)");
		String response=sc.next();
		
		double amount=0.0;
		
		do{
			System.out.println("Input the Indian rupee :");
			double input=sc.nextDouble();
			
			System.out.println("Which currecny you want to convert into :");
			System.out.println("1.USD /2.EUR /3.JPY/4.AUD");
			int choice =sc.nextInt();
			switch(choice){
				case(1):
				    amount=input/89;
					System.out.println("Your amount "+input +" after conversion into USD will be "+amount );
					break;
				case(2):
				    amount=input/90;
					System.out.println("Your amount "+input +" after conversion into EUR will be "+amount );
					break;
				case(3):
				    amount=input/0.55;
					System.out.println("Your amount "+input +" after conversion into JPY will be "+amount );
					break;
				case(4):
				    amount=input/55;
					System.out.println("Your amount "+input +" after conversion into AUD will be "+amount );
					break;
				default:
				    System.out.println("Invalid conversion !");
					
			}
			System.out.println("Do you want another conversion? (Yes/No)");
            response = sc.next();
			
		}while(response.equals("Yes"));
		
		System.out.println("Thank You for Using Our Services ");
	}
	
}