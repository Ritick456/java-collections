package com.bridgelabz.reflection.intermediate.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        
        try{
        
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Method Name : (add/substract/multiply)");

            String methodName = sc.nextLine();

            System.out.println("Enter the number");

            int num1 = sc.nextInt();

            System.out.println("Enter the number");

            int num2 = sc.nextInt();

            MathOperation math = new MathOperation();

            Method method = MathOperation.class.getMethod(methodName, int.class , int.class);

            int result = (int) method.invoke(math , num1, num2);

            System.out.println(result);


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
