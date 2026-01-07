package com.digitalbookstoresystem;

public class OrderItem {

    private Book book;
    private int quantity;

    public OrderItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        book.reduceStock(quantity);
    }

    public double getTotalPrice() {
        double price = book.getPrice() * quantity;
        double discount = book.applyDiscount(price);
        return price - discount;
    }
}