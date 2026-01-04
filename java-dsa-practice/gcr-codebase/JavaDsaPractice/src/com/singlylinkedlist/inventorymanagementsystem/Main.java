package com.singlylinkedlist.inventorymanagementsystem;

public class Main {

	//main method 
	public static void main(String[] args) {

		//object creation
        InventoryList list = new InventoryList();

        //performing operation
        list.addAtEnd(101, "Pen", 50, 10);
        list.addAtEnd(102, "Notebook", 20, 50);
        list.addAtBeginning(103, "Pencil", 100, 5);

        System.out.println("Inventory:");
        list.display();

        list.updateQuantity(101, 60);
        list.searchByName("Notebook");

        list.totalValue();

        list.sortByPrice(true);
        System.out.println("Sorted by Price (Ascending):");
        list.display();
	}
}
