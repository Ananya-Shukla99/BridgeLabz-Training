//a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute 
import java.util.Scanner;

public class DeckOfCards
{

    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

    // method to initialize deck
    public static String[] initializeDeck() 
	{
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // method to shuffle deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        int totalCardsNeeded = players * cardsPerPlayer;

        if (totalCardsNeeded > deck.length) {
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerCards;
    }

    // method to print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[] deck = initializeDeck();

        deck = shuffleDeck(deck);

        String[][] playersCards = distributeCards(deck, players, cardsPerPlayer);

        if (playersCards == null) {
            System.out.println("Cannot distribute cards. Not enough cards in the deck.");
        } else {
            printPlayers(playersCards);
        }

        sc.close();
    }
}
