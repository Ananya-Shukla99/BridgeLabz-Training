package com.warehouse;

public class Main {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 10));
        electronicsStorage.addItem(new Electronics("Mobile", 25));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 50));
        groceryStorage.addItem(new Groceries("Milk", 30));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 15));
        furnitureStorage.addItem(new Furniture("Table", 5));

        System.out.println("Electronics Storage:");
        Storage.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries Storage:");
        Storage.displayItems(groceryStorage.getAllItems());

        System.out.println("\nFurniture Storage:");
        Storage.displayItems(furnitureStorage.getAllItems());
    }
}
