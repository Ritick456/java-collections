package com.bridgelabz.annotation.advanced.rolebasedaccesscontrol;

public class Main {
    public static void main(String[] args) {
        
        User adminUser = new User("ADMIN");
        User regularUser = new User("Regular User");

        SecureService service = new SecureService();

        AccessControl.executeMethod(adminUser, service, "adminTask");

    }
}
