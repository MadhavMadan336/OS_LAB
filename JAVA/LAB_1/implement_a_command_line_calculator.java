//WRITE A PROGRAM TO IMPLEMENT A COMMAND LINE CALCULATOR

package EXPERIMENT_1;
import java.util.Scanner;
public class implement_a_command_line_calculator {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

        // Prompt the user to enter the operation
        System.out.println("Enter the operation (+, -, *, /): ");
        String operation = SC.next();

        // Prompt the user to enter two numbers
        System.out.println("Enter the first number (a): ");
        double a = SC.nextDouble();

        System.out.println("Enter the second number (b): ");
        double b = SC.nextDouble();

        double result = 0.0;

        // Perform the requested operation
        if (operation.equals("+")) {
            result = a + b;
        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("*")) {
            result = a * b;
        } else if (operation.equals("/")) {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero");
                return; // Exit the program
            }
        } else {
            System.out.println("Invalid operation");
            return; // Exit the program
        }

        // Print the result
        System.out.println("Result: " + result);

	}

}
