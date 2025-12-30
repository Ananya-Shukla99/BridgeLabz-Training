//Rohan’s Library Reminder App 
import java.util.Scanner;

public class LibraryReminderApp{

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("--------Library Reminder App--------");
        System.out.println("------------------------------------");

        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println(" Book " + i);

            System.out.print("Enter due date (day number) : ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate)
			{
                int lateDays = returnDate - dueDate;
				
                int fine = lateDays * finePerDay;
				
                System.out.println("Returned late by " + lateDays + " days");
				
                System.out.println("Fine: ₹" + fine);
            }
			else {
                System.out.println("Returned on time. No fine!");
            }
        }
		
        //closing scanner object
        sc.close();
        System.out.println("Thank you for using Rohan’s Library Reminder App ");
    }
}
