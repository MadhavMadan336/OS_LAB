//Write a Java program to enable the user to handle any chance of divide by zero exception.

package EXPERIMENT_6; // This is a package declaration. It's used to group related classes
import java.util.Scanner; // Importing the Scanner class to take user input
public class DivideByZeroExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.println("Enter the numerator:"); // Prompting the user for numerator input
        int numerator = scanner.nextInt(); // Reading user input for numerator

        System.out.println("Enter the denominator:"); // Prompting the user for denominator input
        int denominator = scanner.nextInt(); // Reading user input for denominator

        try {
            int result = divide(numerator, denominator); // Calling the divide method
            System.out.println("Result: " + result); // Printing the result
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // Handling divide by zero exception
        }
    }
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // Throwing an exception for divide by zero
        }
        return numerator / denominator; // Performing the division and returning the result
    }
}
