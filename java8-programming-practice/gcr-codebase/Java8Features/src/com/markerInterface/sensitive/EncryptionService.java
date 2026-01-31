package com.markerInterface.sensitive;

public class EncryptionService {

	static void encrypt(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption needed");
        }
    }
}
