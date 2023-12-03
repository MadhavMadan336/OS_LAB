//Create an exception class, which throws an exception if the operand is non-numeric in calculating modules. (Use command line arguments).

package EXPERIMENT_6; // Defines the package name
import java.util.InputMismatchException; // Imports the InputMismatchException class
import java.util.Scanner; // Imports the Scanner class
class NonNumericOperandException extends Exception {
    NonNumericOperandException() {
        super("Non-numeric operand detected."); // Constructor for custom exception
    }
}
public class third_question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read input from the console
        try {
            System.out.print("Enter the first operand: "); // Prints a prompt for user input
            int operand1 = scanner.nextInt(); // Reads an integer from the user and stores it in operand1

            System.out.print("Enter the second operand: "); // Prints a prompt for user input
            int operand2 = scanner.nextInt(); // Reads an integer from the user and stores it in operand2

            try {
                int modulus = calculateModulus(operand1, operand2); // Calls a method to calculate modulus
                System.out.println("Modulus = " + modulus); // Prints the result of modulus calculation
            } catch (NonNumericOperandException e) {
                System.out.println(e.getMessage()); // Catches and handles the custom exception
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please provide numeric operands."); // Catches and handles invalid input
        }
    }
    static int calculateModulus(int a, int b) throws NonNumericOperandException {
        if (a < 0 || b < 0) {
            throw new NonNumericOperandException(); // Throws custom exception for non-numeric operands
        }
        return a % b; // Calculates and returns the modulus
    }
}
