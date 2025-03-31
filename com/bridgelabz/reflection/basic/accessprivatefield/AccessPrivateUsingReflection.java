package com.bridgelabz.reflection.basic.accessprivatefield;
import java.lang.reflect.Field;

public class AccessPrivateUsingReflection  {
    public static void main(String[] args) {
        
        try{
        
        Person person = new Person();

        Class<?> cls = person.getClass();

        //Accessing private field using reflection

        Field fields = cls.getDeclaredField("age");

        fields.setAccessible(true);

        System.out.println("Old Value " + fields.get(person));

        fields.set(person, 121);

        System.out.println("New Value " + fields.get(person));
        


        }

        catch(Exception e){
            System.out.println(e);
        }



    }
}
