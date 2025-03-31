package com.bridgelabz.reflection.intermediate.accessandmodifystaticfield;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) {
        
        try{

            Field field = Configuration.class.getDeclaredField("API_KEY");
            field.setAccessible(true);

            field.set(null , "NEW SECURE API_KEY");

            System.out.println("API KEY " + Configuration.getApiKey());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
