package com.generics.warehouse;

public class Groceries extends WarehouseItem {

    public Groceries(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
