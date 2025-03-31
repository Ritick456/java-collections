package com.bridgelabz.reflection.basic.getuserinfo;


public class Employee {
    
    String name;
    int id;

    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    public void display(){
        System.out.println("This is display method inside Employee class");
    }

}
