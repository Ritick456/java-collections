package Exceptionhandling;


import java.util.Scanner;

public class InterestCalculator{
    // Method to calculate interest with exception propagation
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter years: ");
            int years = scanner.nextInt();
            
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
