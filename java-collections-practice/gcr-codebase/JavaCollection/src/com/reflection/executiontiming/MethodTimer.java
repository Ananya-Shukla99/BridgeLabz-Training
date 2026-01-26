package com.reflection.executiontiming;

import java.lang.reflect.Method;

class MethodTimer {

    public static void measureExecutionTime(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            if (method.getParameterCount() == 0) {

                long start = System.nanoTime();

                method.invoke(obj);  

                long end = System.nanoTime();

                System.out.println(
                        method.getName() + " took " + (end - start) + " ns"
                );
            }
        }
    }
}
