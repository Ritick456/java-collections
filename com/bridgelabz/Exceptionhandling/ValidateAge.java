package Exceptionhandling;
import java.util.*;

class InvalidAgeException extends Exception{

     InvalidAgeException(String message){
        super(message);
    }

}

public class ValidateAge {

    public static void validate(int age) throws InvalidAgeException{

        if(age < 18){
            throw new InvalidAgeException("Age is not valid");
        }
       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the Age :");
            int age = sc.nextInt();

            validate(age);

            System.out.println("Age is Valid");

        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}





