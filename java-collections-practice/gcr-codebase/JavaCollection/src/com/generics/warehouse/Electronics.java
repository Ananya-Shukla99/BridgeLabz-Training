package com.generics.warehouse;

public class Electronics extends WarehouseItem {

    public Electronics(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
