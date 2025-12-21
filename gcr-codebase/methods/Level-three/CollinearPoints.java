//a program to find the 3 points that are collinear
 
import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {

        // Using cross multiplication to avoid division
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1) &&
            (y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1)) {
            return true;
        }
        return false;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        if (area == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // create Scanner class object
        Scanner input = new Scanner(System.in);

        // Taking inputs for 3 points
        System.out.println("Enter x1 y1:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.println("Enter x2 y2:");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.println("Enter x3 y3:");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // checking using slope method
        System.out.println("Using Slope Formula:");
        if (checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are not Collinear");
        }

        // checking using area method
        System.out.println("Using Area of Triangle Formula:");
        if (checkCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are not Collinear");
        }

        // close the Scanner object
        input.close();
    }
}
