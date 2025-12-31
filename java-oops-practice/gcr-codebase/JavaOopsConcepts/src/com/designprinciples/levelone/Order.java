package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to Order " + orderId + ": " + product.getName());
    }
    
    @Override
    public String toString() {
        return "Order ID: " + orderId;
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println("- " + p.getName() + " : $" + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("Total Amount: $" + total);
    }
}
