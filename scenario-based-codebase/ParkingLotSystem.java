//Parking Lot Gate System
import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5; // total slots
        boolean[] occupancy = new boolean[n];
        int parkedCars = 0;

        while (true) {

            // Stop if parking is full
            if (parkedCars == n) {
                System.out.println("Parking lot is FULL");
                break;
            }

            // Menu
            System.out.println("\n    Parking Lot Menu     ");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Park
                    System.out.print("Enter slot number (0 to " + (n - 1) + "): ");
                    int slot = sc.nextInt();

                    if (slot < 0 || slot >= n) {
                        System.out.println("Invalid slot number ");
                    } 
					else if (occupancy[slot]) {
                        System.out.println("Slot already occupied ");
                    } 
					else {
                        occupancy[slot] = true;
                        parkedCars++;
                        System.out.println("Car parked successfully ");
                    }
                    break;

                case 2: // Exit
                    System.out.println("Thanks for using our services ");
                    return;

                case 3: // Show Occupancy
                    System.out.println("Parking Occupancy:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Slot " + i + ": " + (occupancy[i] ? "Occupied" : "Empty"));
                    }
                    break;

                default:
                    System.out.println("Invalid option  ");
            }
        }
    }
}
