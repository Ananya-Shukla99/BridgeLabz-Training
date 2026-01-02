package com.encapsulationandpolymorphism.levelone;

public abstract class FoodItem {

   
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


    public abstract double calculateTotalPrice();

 
    public String getItemDetails() {
        return "Item: " + itemName +
               ", Price: " + price +
               ", Quantity: " + quantity;
    }


    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
}
