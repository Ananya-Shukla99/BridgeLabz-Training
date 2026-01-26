package com.reflection.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingHandler implements InvocationHandler {

    private Object target;

    LoggingHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("Calling method: " + method.getName());

        return method.invoke(target, args);
    }
}
