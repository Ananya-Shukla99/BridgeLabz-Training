package com.digitalbookstoresystem;

import java.util.*;

public class Order {

    private int orderId;
    private String status; 
    private ArrayList<OrderItem> items = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = "CREATED";
    }

    public void addItem(Book book, int quantity) {
        items.add(new OrderItem(book, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    protected void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
