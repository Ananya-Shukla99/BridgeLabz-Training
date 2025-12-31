//Digital Watch Simulation
import java.util.Scanner;

public class DigitalWatch
{
	public static void main(String [] args){
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~Digital Watch~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//taking user input for time
		System.out.println("Whats the current time(in hour)");
		int input=sc.nextInt();
		
		System.out.println("Whats the current time(in minute)");
		int input2=sc.nextInt();
		//Loop for hour
		for (int hour = input; hour <=24; hour++) {

            for (int minute = input2; minute <60; minute++) {

                // Power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut at 13:00 ");
                    break;
                }

                System.out.println(
                    (hour < 10 ? "0" + hour : hour) + ":" +
                    (minute < 10 ? "0" + minute : minute)
                );

                try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println("Watch is interrupted");
				}
            }

            if (hour == 13) {
                break;
            }
        }
        System.out.println("Thank You For Using Services ");
		
		//closing scanner object
		sc.close();
	}
}