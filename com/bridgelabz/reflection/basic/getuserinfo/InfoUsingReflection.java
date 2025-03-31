package com.bridgelabz.reflection.basic.getuserinfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InfoUsingReflection {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String className = sc.nextLine();

        try{
            Class<?> cls = Class.forName(className);

            
            System.out.println(cls.getName());

            Method[] methods = cls.getDeclaredMethods();

            for(Method method : methods){
                System.out.println(method.getName());
            }

            Constructor[] constructors = cls.getDeclaredConstructors();

            for(Constructor constructor : constructors){
                System.out.println(constructor.getName());
            }


        }
        catch(Exception e){
            System.out.println(e);
        }







    }
}
