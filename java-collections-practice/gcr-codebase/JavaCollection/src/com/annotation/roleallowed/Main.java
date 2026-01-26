package com.annotation.roleallowed;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        CurrentUser user1 = new CurrentUser("USER");
        CurrentUser user2 = new CurrentUser("ADMIN");

        AdminOperations ops = new AdminOperations();

        executeMethod(ops, "deleteUser", user1);
        executeMethod(ops, "deleteUser", user2);
        executeMethod(ops, "viewProfile", user1);
        executeMethod(ops, "openHelp", user1);
    }

    public static void executeMethod(Object obj, String methodName, CurrentUser user) throws Exception {
        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (!roleAllowed.value().equals(user.getRole())) {
                System.out.println("Access Denied! User role: " + user.getRole());
                return;
            }
        }

        method.invoke(obj);
    }
}