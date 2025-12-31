//Bus Route Distance Tracker
import java.util.*;

public class DistanceTracker
{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome To Bus Route Distance Tracker ");
		System.out.println("Let's start the ride ?(Yes/No)");
		String response=sc.next();
		
		int distance =0;
		int customerCost=0;
		int costPerKm=20;
		int distanceBetweenStops =1;//In km
		do{
			System.out.println("What distance you want to travel:");
			int input=sc.nextInt();
			
			distance+=input;
			
			System.out.println("Do you want continue this ride ? (Yes/Stop)");
            response = sc.next();
			
		}while(response.equals("Yes"));
		
		customerCost=costPerKm*distance;
	    System.out.println("You have travelled "+distance+" Km ");
	    System.out.println("Your totalCost will be "+customerCost+" Rs ");


		System.out.println("Thank You for Using Our Services ");
	}
	
}