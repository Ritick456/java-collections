package com.bridgelabz.annotation.advanced.rolebasedaccesscontrol;

public class User {

    private String role;

    public User(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}
