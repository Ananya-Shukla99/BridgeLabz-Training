package com.bagnball;

public class Main {

    public static void main(String[] args) {

        // Create a bag
        Bag bag1 = new Bag(101, "Red", 2);
        Bag bag2 = new Bag(102, "Bule", 4);
        
        // Create balls
        Ball b1 = new Ball(1, "Yellow", "Small");
        Ball b2 = new Ball(2, "Green", "Medium");
        Ball b3 = new Ball(3, "Blue", "Large");
        Ball b9 = new Ball(1, "Grey", "Small");
        Ball b8 = new Ball(2, "Pink", "Medium");
        Ball b7 = new Ball(3, "Black", "Large");

        // Add balls
        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3); 
        bag2.addBall(b9);
        bag2.addBall(b8);
        bag2.addBall(b7);

        // Display bag
        bag1.display();
        bag2.display();

        // Remove a ball
        bag1.removeBall(b1);
        bag2.removeBall(b7);

        // Display again
        bag1.display();
        bag2.display();
    }
}
