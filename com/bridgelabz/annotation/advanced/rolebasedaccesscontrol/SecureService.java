package com.bridgelabz.annotation.advanced.rolebasedaccesscontrol;

public class SecureService {

    @RoleAllowed(role = "ADMIN")
    public void adminTask(){
        System.out.println("Executing Admin Task");
    }

    public void generalTask(){
        System.out.println("Executing General Task");
    }
    
}
