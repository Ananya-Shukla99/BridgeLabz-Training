//Phone Recharge Simulator 
import java.util.*;

public class RechargeSimulator{
    public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		
		double balance = 0;
        char choice;

        do {
            System.out.println("\n Enter Mobile Operator (Airtel / Jio / VI): ");
            String operator = sc.next();

            System.out.println("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            balance += amount;

            // Switch case for offers
            switch (operator.toLowerCase()) {
                case "airtel":
                    System.out.println("Airtel Offer: 1GB/day for 28 days");
                    break;

                case "jio":
                    System.out.println("Jio Offer: Unlimited calls + 1.5GB/day");
                    break;

                case "vi":
                    System.out.println("VI Offer: Weekend data rollover");
                    break;

                default:
                    System.out.println("Invalid Operator!");
            }

            System.out.println("Recharge successful!");
            System.out.println("Current Balance: Rs " + balance);

            System.out.println("Do you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println(" Thank you for using Phone Recharge Simulator!");
        sc.close();
	
    }
}