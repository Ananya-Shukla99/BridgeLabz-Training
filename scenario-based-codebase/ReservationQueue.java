//Train Reservation Queue

import java.util.Scanner;

public class ReservationQueue{
	
	public static void main(String[]args){
		
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" Welcome to Reservation Queue ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		int totalAvailable=20;
		int totalSeatCount=20;
		int bookedSeats=0;
		int input=0;
		int seats=0;
		
		do{  
			System.out.println("~~~~~~~~~~MENU~~~~~~~~~");
		
			System.out.println("1.Ticket Booking" );
			System.out.println("2.Cancelling Ticket");
		    System.out.println("3.Show Availability " );
		    System.out.println("4.Exit Application");

		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Input you optin (1/2/3/4) :");
		    input =sc.nextInt();
			if(input ==1){
				System.out.println("Enter the number of tickects you want to book ");
				seats=sc.nextInt();
			}
			else if(input ==2){
				System.out.println("Enter the number of tickects you want to cancel ");
				seats=sc.nextInt();
			}
			switch(input){
				case(1):
					if(totalSeatCount !=0 && totalAvailable>=seats){
						System.out.println("Congratulations Your booking of "+ seats + " is Sucessful !");
						totalSeatCount-=seats;
						bookedSeats+=seats;
					}
					else{
						System.out.println("Sorry! Your booking of "+ seats + " is currently available!");					
					}
					break;
				case(2):
					if(bookedSeats>=seats && totalAvailable>=seats){
						System.out.println("Your Cancellation of "+ seats + " is Sucessful !");
						totalSeatCount+=seats;
						bookedSeats-=seats;
					}
					else{
						System.out.println("Sorry! something went wrong kindely check your credentials ");					
					}
					break;
				case(3):
					System.out.println("Total Available seats are : "+totalAvailable);
					System.out.println("Total booked seats are : "+ bookedSeats);
					System.out.println("Total seats left are : "+ (totalAvailable-bookedSeats));
			        break;
				case (4):
					System.out.println("Exiting Application...");
			        break;
                default:
                    System.out.println("Invalid option!");
			}
		}while(input!=4);
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" Thank You For Using Our Services ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
