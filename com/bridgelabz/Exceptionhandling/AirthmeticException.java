package Exceptionhandling;

import java.util.*;

public class AirthmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
                 
            System.out.println("Enter the numerator");
            int num = sc.nextInt();

            System.out.println("Enter the denominator");
            int deno = sc.nextInt();

            int result = num / deno;

            System.out.println(result);
        
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
}
