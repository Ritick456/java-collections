package com.bridgelabz.reflection.advanced.generateajsonrepresentation;

public class Main {
    public static void main(String[] args) {
        
        Person person = new Person("Alice", 25 , true);


        String json = JsonSerializer.toJson(person);

        System.out.println(json);
    }
}
