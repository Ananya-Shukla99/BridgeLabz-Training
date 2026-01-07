package com.digitalbookstoresystem;

public class Main {
    public static void main(String[] args) {

        Book ebook = new EBook("Java Basics", "John", 500, 10);
        Book printed = new PrintedBook("OOP Concepts", "Smith", 800, 5);

        Order order = new Order(101);
        order.addItem(ebook, 2);
        order.addItem(printed, 1);

        System.out.println("Total Bill: " + order.calculateTotal());
        System.out.println("Order Status: " + order.getStatus());
    }
}
