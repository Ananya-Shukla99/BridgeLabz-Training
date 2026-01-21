package com.generics.onlinemarketplace;

import java.util.*;

public class ProductCatalog {

	private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
       for(Product <? extends Category>p: products) {
    	   System.out.println(p);
       }
    }
}

