package com.encapsulationandpolymorphism.levelone;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50.0;
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5% (includes extra charge)";
    }
}
