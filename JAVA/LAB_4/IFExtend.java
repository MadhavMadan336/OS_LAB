//Write a program to create interface A, In this interface we have two methods meth1 and meth2. Implement this interface in another class named MyClass


package EXPERIMENT_4;
//Import the Scanner class from the java.util package
import java.util.Scanner;

//Define an interface named A
interface A {
 void meth1(); // Declare an abstract method named meth1 with no parameters and no return value
 void meth2(); // Declare an abstract method named meth2 with no parameters and no return value
}

//Define a class named MyClass that implements the interface A
class MyClass implements A {
 Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
 
 // Implement the meth1 method from the interface A
 public void meth1() {
     System.out.println("Implement Method1(addition)"); // Print a message
     System.out.println("Enter first no. for addition: "); // Prompt the user to enter the first number
     int a = sc.nextInt(); // Read an integer from the user and store it in the variable a
     System.out.println("Enter second no. for addition"); // Prompt the user to enter the second number
     int b = sc.nextInt(); // Read an integer from the user and store it in the variable b
     System.out.println("The addition of first and second no. is " + (a + b)); // Calculate and print the sum
 }
 
 // Implement the meth2 method from the interface A
 public void meth2() {
     System.out.println("Implement Method2(subtraction:)"); // Print a message
     System.out.println("Enter first no. for subtraction: "); // Prompt the user to enter the first number
     int a = sc.nextInt(); // Read an integer from the user and store it in the variable a
     System.out.println("Enter second no. for subtraction: "); // Prompt the user to enter the second number
     int b = sc.nextInt(); // Read an integer from the user and store it in the variable b
     System.out.println("The subtraction of first and second no. is " + (a - b)); // Calculate and print the difference
 }
}

//Define a class named IFExtend
class IFExtend {
 // Define the main method
 public static void main(String arg[]) {
     MyClass ob = new MyClass(); // Create an instance of the MyClass class
     
     ob.meth1(); // Call the meth1 method on the object ob
     ob.meth2(); // Call the meth2 method on the object ob
 }
}
