package com.reflection.accessprivatefield;

import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) {
        try {
            Person person = new Person();

            Class<?> cls = person.getClass();

            Field ageField = cls.getDeclaredField("age");

            ageField.setAccessible(true);

            ageField.set(person, 25);

            int ageValue = (int) ageField.get(person);

            System.out.println("Modified age value: " + ageValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
