package com.gameBox;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create games (free & paid)
        Game g1 = new StrategyGame("Clash Strategy", "Strategy", 0, 4.5);
        Game g2 = new StrategyGame("War Tactics", "Strategy", 500, 4.8);

        // Store games in array
        Game[] games = { g1, g2 };

        // User's owned games list (encapsulation respected)
        ArrayList<Game> ownedGames = new ArrayList<>();
        ownedGames.add(g1);

        // Create user
        User user = new User("Alex", ownedGames) {
            // anonymous class since User is abstract
        };

        // Download games
        System.out.println("---- Downloading Games ----");
        user.download(games);

        // Play demo 
        System.out.println("\n---- Playing Demos ----");
        user.playDemo(games);

        // Apply seasonal offers
        System.out.println("\n---- Applying Offers ----");
        user.applyOffer(games);
    }
}
