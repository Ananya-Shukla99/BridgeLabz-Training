package com.binarysearchtree.inventory;

public class Product {

	class Node {

		String name;
		String sku;
		double price;
		Node left, right;

		Node(String name, String sKU, double price) {
			this.name = name;
			sku = sKU;
			this.price = price;
			left=right=null;
		}
	}
	
	Node root;
	
	//insert
	Node insert (Node root, String name, String sku, double price) {
		if(root ==  null) {
			return new Node (name, sku, price);
		}
		if(sku.compareTo(root.sku)<0) {
			root.left = insert(root.left, name, sku,  price);
		}
		else if(sku.compareTo(root.sku) > 0) {
			root.right = insert(root.right,name, sku,  price);
		}
		
		return root;
	}
	//LookUp
	Node lookUp(Node root, String sku) {
		if (root == null || root.sku.equals(sku))
            return root;

        if (sku.compareTo(root.sku) < 0)
            return lookUp(root.left, sku);

        return lookUp(root.right, sku);
	}
	
	//Update
	void updatePrice(String sku, double newPrice) {
		Node product = lookUp(root, sku);
        if (product != null) {
            product.price = newPrice;
            System.out.println("Price updated for SKU " + sku);
        } else {
            System.out.println("Product not found.");
        }
	}
	//Display
	void display(Node root) {
	    if (root == null)
	        return;
	    display(root.left);
	    System.out.println("name : " + root.name + " price : " + root.price);
	    display(root.right);
	}

}
