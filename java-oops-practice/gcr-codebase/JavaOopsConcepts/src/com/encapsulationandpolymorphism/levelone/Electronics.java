package com.encapsulationandpolymorphism.levelone;

public class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; 
    }

    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}
