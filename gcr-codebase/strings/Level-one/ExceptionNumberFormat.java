//a program to demonstrate NumberFormatException

import java.util.Scanner;

public class ExceptionNumberFormat {

    // method to generate Exception
    static void generateException(String text) {
		
        System.out.println("Generating NumberFormatException");
        int number = Integer.parseInt(text);
		
        System.out.println("Number is: " + number);
    }

    // method to handle Exception 
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);

        }
		catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);

        }
		catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);

        }
		finally {
            System.out.println("Exception handling completed.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter a value: ");
        String s = sc.nextLine();

        // generate exception
        try {
            generateException(s);
        }
		catch (RuntimeException e) {
            System.out.println("RuntimeException caught in main: " + e);
        }

        // handle Exception
        handleException(s);

        sc.close();
    }
}
