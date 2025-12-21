//a program to evaluate number
import java.util.Scanner;

public class NumberCheckerFour {

    // method to check prime number
    public static boolean checkPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method to check neon number
    public static boolean checkNeonNumber(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == number) {
            return true;
        }
        return false;
    }

    // method to check spy number
    public static boolean checkSpyNumber(int number) {

        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }

        if (sum == product) {
            return true;
        }
        return false;
    }

    // method to check automorphic number
    public static boolean checkAutomorphicNumber(int number) {

        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp = temp / 10;
            square = square / 10;
        }
        return true;
    }

    // method to check buzz number
    public static boolean chcekBuzzNumber(int number) {

        if (number % 7 == 0 || number % 10 == 7) {
            return true;
        }
        return false;
    }

    // main method
    public static void main(String[] args) {
	
	    // Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Taking the user input
        System.out.println("Enter the number:");
        int number = input.nextInt();

        //printing the numbers are prime, neon, spy, automorphic, buzz
        System.out.println("Is Prime Number: " + checkPrime(number));
        System.out.println("Is Neon Number: " + checkNeonNumber(number));
        System.out.println("Is Spy Number: " + checkSpyNumber(number));
        System.out.println("Is Automorphic Number: " + chcekAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + chcekBuzzNumber(number));

		//close the Scanner object
        input.close();
    }
}
