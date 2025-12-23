// a program to demonstrate ArrayIndexOutOfBoundsException
import java.util.Scanner;

public class ArrayException{

    // method that generates runtime exception 
    static void generateException(String[] names) {
	
        System.out.println(names[names.length]);
    }

    // method that handles ArrayIndexOutOfBoundsException
    static void handleException(String[] names) {
        try {
           
            System.out.println(names[names.length + 1]);
			
        } 
		catch (ArrayIndexOutOfBoundsException e) {
		
            System.out.println("ArrayIndexOutOfBoundsException handled");
			
        } 
		catch (RuntimeException e) {
		
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.print("Enter number of names ");
        int size = sc.nextInt();
		
        sc.nextLine();

        String[] names = new String[size];

        // Taking names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }

        //generate exception 
        try {
            generateException(names);
        } 
		catch (Exception e) {
            System.out.println("Exception occurred while generating exception");
        }

        handleException(names);
		
		sc.close();
    }
}
