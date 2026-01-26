package com.reflection.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();

            Class<?> cls = calculator.getClass();

            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            method.setAccessible(true);

            int result = (int) method.invoke(calculator, 5, 4);

            System.out.println("Result of multiply: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
