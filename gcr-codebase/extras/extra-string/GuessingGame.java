//a Java program where the user thinks of a number between 1 and 100
import java.util.Scanner;

public class GuessingGame {
    //creating Scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number 1-100 and I will guess it!");
        play();
    }

    static void play() {
        int low = 1, high = 100;
        while (low <= high) {
            int guess = (low + high) / 2;
            String response = askFeedback(guess);

            if (response.equals("c")) break; 
            if (response.equals("h")) high = guess - 1;
            else low = guess + 1;
        }
        System.out.println("Game over! I found it.");
    }

    static String askFeedback(int guess) {
        System.out.print("Is it " + guess + "? (h=too high, l=too low, c=correct): ");
        return input.next().toLowerCase();
    }
}
