//a program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;

public class StringException{

    // method that generates 
    static void generateException(String text) {

        System.out.println(text.charAt(text.length()));
		
    }

    // method that handles 
    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        }
		catch (StringIndexOutOfBoundsException e) {
			
            System.out.println("StringIndexOutOfBoundsException handled");
        }
		catch (Exception e) {
			
            System.out.println("General exception handled");
        }
    }

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Generate exception 
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception occurred while generating exception");
        }

        // Handle exception properly
        handleException(input);
		
		sc.close();
    }
}
