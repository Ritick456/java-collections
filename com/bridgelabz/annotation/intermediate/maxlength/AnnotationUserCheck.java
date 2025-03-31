package com.bridgelabz.annotation.intermediate.maxlength;

public class AnnotationUserCheck {
    public static void main(String[] args) {

        try{

        User user = new User("Deepak");

        String name = user.getUsername();

        System.out.println(name);

        }
        
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
