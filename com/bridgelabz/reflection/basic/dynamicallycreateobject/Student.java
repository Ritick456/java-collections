package com.bridgelabz.reflection.basic.dynamicallycreateobject;


public class Student {

    public String name;
    

    Student(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name " + name);
    }

}