//The coffee counter chronices
import java.util.*;

public class CoffeeCounter
{
	public static void main(String[]args){
		//created a scanner class
	    Scanner sc=new Scanner(System.in);
		
		//Displaying the menu
		String []coffee={"Espresso", "Latte", "Cappuccino", "Americano", "Mocha", "Cold Brew"};
		int [] cost={200, 160 ,250,300, 450, 500};
		
		//printing the menu with cost
		System.out.println("Choose the coffee :");
		for(int i=0;i<coffee.length; i++){
			System.out.print(coffee[i]+"  : ");
			System.out.println(cost[i]);
		}
		
		//Taking user input
		String input=sc.next();
		System.out.println("Input the quantity: ");
		int quantity=sc.nextInt();
		int totalCost=0;
	    
		//Using switch to know the type and calculate the cost
		switch(input){
			
			case "Espresso":
			    totalCost=quantity*cost[0];
				break;
			case "Latte":
			    totalCost=quantity*cost[1];
				break;
			case "Cappuccino":
			    totalCost=quantity*cost[2];
				break;
			case "Americano":
			    totalCost=quantity*cost[3];
				break;
			case "Mocha":
			    totalCost=quantity*cost[4];
				break;
			case "Cold Brew":
			    totalCost=quantity*cost[5];
				break;
		}
		
		//Calculating the gst
		double withGst=totalCost+totalCost*0.05;

        //Printing the out put
		System.out.println("Your total cost with GST will be :"+ withGst);
		
		//closing the sc object
		sc.close();
	}
}