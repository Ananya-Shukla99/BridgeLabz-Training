//Metro Smart Card Fare Deduction
import java.util.*;

public class SmartCardFare 
{
	public static void main(String []args){
		
		Scanner sc=new Scanner (System.in);
        
		System.out.println("Input the existing balance ");
		int balance=sc.nextInt();
		
		int pricePerKm=10;
		
		while(balance>0){
			
			System.out.println("input the distance you want to travel ");
			int distance=sc.nextInt();
			int price=distance*pricePerKm;
			if(balance>=price){
			    System.out.println("Yes you can travel");
				balance-=price;
			}
			else{
				System.out.println("No you cannot travel the balance is not sufficient ");
				break;
			}
		}
		
		sc.close();
	}
}