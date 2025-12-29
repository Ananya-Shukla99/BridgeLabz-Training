// Shopkeeper’s Discount Dashboard

import java.util.*;

public class DiscountDashboard{
	
    public static void main(String []args){
        
		//creating scanner object
		Scanner sc=new Scanner (System.in);
	    
		//Display menu
		System.out.println("------Menu------");
		System.out.println("1.NoteBook ----- 90 Rs");
		System.out.println("2.Book     -----390Rs");
		System.out.println("3.Box      -----190Rs");
		System.out.println("4.color    -----70Rs");
		System.out.println("5.Bag      -----490Rs");
		System.out.println("6.Bottle   -----200Rs");
		System.out.println("7.Exit.");
		
		//taking order and calculating money
		int sum=0;
		while(true){
			
			System.out.println("Enter the product/ Exit : ");
			String input =sc.next().toLowerCase();
			if(input.equals("exit")){
				break;
			}
			//asking for quantity
			System.out.println("Enter quantity :");
			int quantity=sc.nextInt();

			if(input.equals("notebook")){
				sum+=(quantity * 90);
			}
			else if(input.equals("book")){
				sum+=(quantity * 390);
			}
			else if(input.equals("box")){
				sum+=(quantity * 190);
			}
			else if(input.equals("color")){
				sum+=(quantity * 70);
			}
			else if(input.equals("bag")){
				sum+=(quantity * 490);
			}
			else if(input.equals("bottle")) {
				sum+=(quantity * 200);
			}
			else{
                System.out.println("Invalid product name!");
            }
			
		}
		//Calculating Discount
		//Discount : on purchase of more than 500 -10% discount
		// on purchase of more than 250 -5% discount

		double discountedPrice=0.0;
		double discount=0.0;
		if(sum>=500){
			discount=sum*(0.1);
			discountedPrice=sum-discount;
		}
		else if(sum>=250){
			discount=sum*(0.05);
			discountedPrice=sum-discount;
		}
		
		if(sum>=500){
			System.out.println("Your total sum will be "+ sum);
			System.out.println("With our discount policies, your final total will be "+ discountedPrice);
		}
		else if(sum>=250){
			System.out.println("Your total sum will be "+ sum);
			System.out.println("With our discount policies, your final total will be "+ discountedPrice);
		}
		else{
			System.out.println("Your total sum will be : "+sum);
		}
		System.out.println("Thank You for using our services ");
    }
}