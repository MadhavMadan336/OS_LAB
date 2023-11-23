//Write a program to create an interface named test. In this interface, the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class we use the object of arithmetic class.

// Define a package named EXPERIMENT_4
package EXPERIMENT_4;

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define an interface named Test
interface Test {
    // Declare an abstract method named square that takes an integer parameter and returns an integer
    public int square(int a);
}

// Define a class named arithmetic that implements the Test interface
class arithmetic implements Test {
    int s; // Declare an integer variable s
    
    // Implement the square method from the Test interface
    public int square(int b) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter any number: "); // Prompt the user to enter a number
        s = sc.nextInt(); // Read an integer from the user and store it in the variable s
        System.out.println("Inside arithmetic class – implemented method square"); // Print a message
        System.out.println("Square of " + s + " is " + s * s); // Calculate and print the square of s
        return s; // Return the value of s
    }
    
    // Define a method named armeth
    void armeth() {
        System.out.println("Inside method of class Arithmetic"); // Print a message
    }
}

// Define a class named ToTestInt
class ToTestInt {
    // Define the main method
    public static void main(String a[]) {
        System.out.println("calling from ToTestInt class main method"); // Print a message
        
        Test t = new arithmetic(); // Create an object of type Test and assign it an instance of arithmetic
        
        System.out.println("created object of test interface – reference Arithmetic class"); // Print a message
        System.out.println("Hence Arithmetic class method square called"); // Print a message
        System.out.println("This object cannot call armeth method of Arithmetic class"); // Print a message
        
        t.square(10); // Call the square method on the object t with the argument 10
        
    }
}
