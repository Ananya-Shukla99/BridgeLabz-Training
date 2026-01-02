package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryMain{

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        double grandTotal = 0;

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());

            double total = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable discountItem = (Discountable) item;
                double discount = discountItem.applyDiscount();
                total -= discount;
                System.out.println(discountItem.getDiscountDetails());
                System.out.println("Discount Applied: " + discount);
            }

            System.out.println("Final Price: " + total);
            grandTotal += total;
            System.out.println("-----------------------------");
        }

        System.out.println("Grand Total Amount: " + grandTotal);
    }
}
