package com.encapsulationandpolymorphism.levelone;

public class VegItem extends FoodItem implements Discountable {

    private static final double DISCOUNT_RATE = 0.10; // 10% discount

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}
