package com.bridgelabz.annotation.advanced.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class AccessControl {

    public static void executeMethod(User user, SecureService obj, String methodName) {

        try {
            Method method = obj.getClass().getMethod(methodName); // Get the method dynamically

            // Check if method has @RoleAllowed annotation
            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                // Compare user role with required role
                if (!user.getRole().equals(roleAllowed.role())) {
                    System.out.println(
                            "Access Denied! User with role " + user.getRole() + " cannot access " + methodName);
                    return;
                }
            }

            // Corrected: Invoke the method on the provided object
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
