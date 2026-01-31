package com.markerInterface.sensitive;

public class Main {

    public static void main(String[] args) {

        User user = new User("admin", "secret123");
        ProductInfo product = new ProductInfo("Laptop", 75000);

        EncryptionService.encrypt(user);    
        EncryptionService.encrypt(product); 
    }
}
