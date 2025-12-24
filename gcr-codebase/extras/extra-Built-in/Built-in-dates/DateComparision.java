//compare dates
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparision{
	
	public stataic void main(String[]agrs){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter date one : ");
		LocalDate date1=LocalDate.parse(sc.nextLine());
		
		System.out.println("Enter date two : ");
		LocalDate date2=LocalDate.parse(sc.nextLine());
		
		 if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }

        sc.close();
	}
}