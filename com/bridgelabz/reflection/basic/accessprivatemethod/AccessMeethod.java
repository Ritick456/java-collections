package com.bridgelabz.reflection.basic.accessprivatemethod;
import java.lang.reflect.Method;

public class AccessMeethod {

    public static void main(String[] args) {
        try{
            Calculator cal = new Calculator();

            Class<?> cls = cal.getClass();

            Method method = cls.getDeclaredMethod("multiply" , int.class , int.class);

            method.setAccessible(true);

            int result = (int)method.invoke(cal, 5 , 20);

            System.out.println(result);

        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
