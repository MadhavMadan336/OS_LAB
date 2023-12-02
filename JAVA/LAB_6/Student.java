//Write a program in Java to display students' names and roll numbers. Initialize respective array variables for 10 students. Handle Array Index Out Of Bounds ExCeption, so that any such problem doesn’t cause illegal termination of the program. 

// This is a Java program to display students' names and roll numbers
package EXPERIMENT_6; // This is a package declaration. It's used to group related classes

public class Student // This is the main class named "Student"
{
    public static void main(String[] args) {
        // Arrays to store names and roll numbers of students
        String[] names = {"RAM", "RAHUL", "SGS", "ANUJ", "AKASH", "GOLU", "Sara", "RONIT", "AKSHAT", "OM"};
        int[] rollNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        
        try {
            // Loop to iterate through the arrays
            for (int i = 0; i <= 10; i++) {
                // Printing names and roll numbers
                System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception if index goes out of bounds
            System.out.println("Error: Index out of bounds.");
        }
    }
}

