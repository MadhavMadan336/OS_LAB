//WRITE A PROGRAM TO ADD TWO NUMBER USING COMMAND LINE ARGUMENTS 

package EXPERIMENT_1;
import java.util.Scanner;
public class add_two_number_using_command_line_arguments {
	public static void main(String[] args) {
	// Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter two numbers
    System.out.println("Enter two numbers: ");
    
    // Read the two numbers from the user and store them in variables a and b
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    // Close the scanner since we have read all the input
    scanner.close();

    // Calculate the sum
    int sum = a + b;

    // Print the result
    System.out.println("Sum of " + a + " and " + b + " is: " + sum);
}

}
