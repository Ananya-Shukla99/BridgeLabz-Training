//a program of Date Arithmetic
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input from user
        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = sc.next();

        // Convert input to LocalDate
        LocalDate date = LocalDate.parse(input);

        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);

        date = date.minusWeeks(3);

        System.out.println("Final Date: " + date);

        sc.close();
    }
}
