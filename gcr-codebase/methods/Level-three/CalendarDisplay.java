//a program to display a calendar for a given month and year
import java.util.Scanner;

public class CalendarDisplay {

    // method to get month name
    public static String getMonthName(int month) {

        String[] months = {"January", "February", "March", "April","May", "June", "July", "August",
                           "September", "October", "November", "December"};

        return months[month - 1];
    }

    // method to check leap year
    public static boolean checkLeapYear(int year) {

        if ((year % 400 == 0) ||
           (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    // method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {31, 28, 31, 30,31, 30, 31, 31,30, 31, 30, 31};

        // check for february and leap year
        if (month == 2 && checkLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // method to get first day of the month (0 = Sunday)
    public static int getFirstDay(int month, int year) {

        int day = 1;

        if (month < 3) {
            month = month + 12;
            year = year - 1;
        }

        int k = year % 100;
        int j = year / 100;

        int h = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        int firstDay = (h + 6) % 7;
		
        return firstDay;
    }

    public static void main(String[] args) {
        
		// creating the Scanner object
        Scanner input = new Scanner(System.in);

        //Taking the input of month
        System.out.print("Enter month (MM): ");
        int month = input.nextInt();

        //Taking the input of year
        System.out.print("Enter year (YYYY): ");
        int year = input.nextInt();

        // display month and year
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            // move to next line 
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
		
		//close the Scanner object
        input.close();
    }
}
