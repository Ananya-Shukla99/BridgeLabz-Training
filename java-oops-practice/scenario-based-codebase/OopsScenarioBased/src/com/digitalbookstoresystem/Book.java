package com.digitalbookstoresystem;

public abstract class Book implements IDiscountable{

	//fields
    private String title;
    private String author;
    private double price;
    private int stock;

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
	
    @Override
    public abstract double applyDiscount(double price);

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    
    //update stock
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Insufficient stock");
        }
    }
}
