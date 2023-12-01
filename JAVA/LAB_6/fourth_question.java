//Write a Java program to throw an exception for employee details. 
//• If an employee's name is a number, a name exception must be thrown.
//• If an employee age is greater than 50, an age exception must be thrown. 
//• Or else an object must be created for the entered employee details

package EXPERIMENT_6; // Defines the package name
import java.util.*; // Imports the necessary packages
class NameException extends Exception {
    NameException() {
        super("Invalid name. Name cannot contain numbers."); // Constructor for custom name exception
    }
}
class AgeException extends Exception {
    AgeException() {
        super("Invalid age. Age cannot be greater than 50."); // Constructor for custom age exception
    }
}
class Employee {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}
public class fourth_question {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("-----ENTER EMPLOYEE DETAILS-----");
        System.out.println("Enter Name and Age:");
        Scanner in = new Scanner(System.in); // Creates a Scanner object to read input from the console
        try {
            name = in.nextLine(); // Reads a line of text (the employee name)
            if (!name.matches("[a-zA-Z]+")) {
                throw new NameException(); // Throws a custom exception if name contains non-alphabetic characters
            }
            age = in.nextInt(); // Reads an integer (the employee age)
            if (age > 50) {
                throw new AgeException(); // Throws a custom exception if age is greater than 50
            }
            Employee employee = new Employee(name, age); // Creates an Employee object with provided details
            employee.displayDetails(); // Displays employee details

        } catch (NameException e) {
            System.out.println(e.getMessage()); // Catches and handles the custom name exception
        } catch (AgeException e) {
            System.out.println(e.getMessage()); // Catches and handles the custom age exception
        }
    }
}
