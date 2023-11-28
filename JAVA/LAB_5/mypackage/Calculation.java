//Write a java program to implement the concept of importing classes from user defined package and created packages

// Define a package named 'mypackage'
package mypackage;

// Define a class named 'Calculation' in the 'mypackage' package
public class Calculation {
    
    // Define a method named 'add' that takes two integers as parameters and returns their sum
    public static int add(int a, int b) {
        return a + b; // Return the sum of 'a' and 'b'
    }

    // Define a method named 'subtract' that takes two integers as parameters and returns their difference
    public static int subtract(int a, int b) {
        return a - b; // Return the difference of 'a' and 'b'
    }
}
