package com.encapsulationandpolymorphism.levelone;

public class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; 
    }

    @Override
    public double calculateTax() {
        return price * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}
