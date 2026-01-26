package com.annotation.logexcution;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method[] methods = PerformanceTest.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(test); 
                long end = System.nanoTime();
                System.out.println("Method: " + method.getName() + " | Execution Time: " + (end - start) + " ns");
            }
        }
    }
}