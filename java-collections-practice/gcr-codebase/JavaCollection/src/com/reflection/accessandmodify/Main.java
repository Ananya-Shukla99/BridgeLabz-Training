package com.reflection.accessandmodify;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception {

        Class<?> c = Configuration.class;

        Field field = c.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_KEY_123");

        System.out.println("API_KEY = " + field.get(null));
    }
}
