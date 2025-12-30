//Movie Ticket Booking App
import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("-----Movie Ticket Booking App ------");
        System.out.println("------------------------------------");

        Scanner sc = new Scanner(System.in);
        int cost = 0;

        System.out.println("------ Select type of movie -----");
        System.out.println("1. Horror  ---- 150 Rs");
        System.out.println("2. Action  ---- 200 Rs");
        System.out.println("3. Comedy  ---- 350 Rs");
        System.out.println("4. Mystery ---- 500 Rs");
        System.out.println("------------------------------------");

        System.out.print("Your movie choice(1/2/3/4): ");
        int movieType = sc.nextInt();

        switch (movieType) {
            case 1:
                System.out.println("Horror selected");
                cost += 150;
                break;
            case 2:
                System.out.println("Action selected");
                cost += 200;
                break;
            case 3:
                System.out.println("Comedy selected");
                cost += 350;
                break;
            case 4:
                System.out.println("Mystery selected");
                cost += 500;
                break;
            default:
                System.out.println("Invalid movie choice");
                sc.close();
                return;
        }

        // Seat selection
        System.out.println("------ Select seat type -----");
        System.out.println("Gold / Silver / Common");
        System.out.print("Your seat choice: ");
        String seatType = sc.next();

        if (seatType.equalsIgnoreCase("Gold")) {
            cost += 200;
        } else if (seatType.equalsIgnoreCase("Silver")) {
            cost += 150;
        } else {
            cost += 100;
        }

        // Snack selection
        System.out.println("------ Select snack type -----");
        System.out.println("Popcorn / Chips / Pizza");
        System.out.print("Your snack choice: ");
        String snackType = sc.next();

        if (snackType.equalsIgnoreCase("Popcorn")) {
            cost += 200;
        } else if (snackType.equalsIgnoreCase("Chips")) {
            cost += 150;
        } else {
            cost += 100;
        }

        System.out.println("------------------------------------");
        System.out.println("Total cost: " + cost + " Rs");
        System.out.println("Thank you for booking!");
        System.out.println("------------------------------------");

        sc.close();
    }
}
