//Write a java program to implement the concept of importing classes from user defined package and created packages

package mypackage;
// Import the Calculation class from the mypackage package
import mypackage.Calculation;

// Define the main class
public class main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Call the add method from the Calculation class and store the result in the 'sum' variable
        int sum = Calculation.add(x, y);

        // Call the subtract method from the Calculation class and store the result in the 'difference' variable
        int difference = Calculation.subtract(x, y);

        // Print the result of the addition
        System.out.println("Sum: " + sum);

        // Print the result of the subtraction
        System.out.println("Difference: " + difference);
    }
}
