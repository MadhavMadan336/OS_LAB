//Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuilt function) 

package EXPERIMENT_7;

import java.util.Scanner; // Importing the Scanner class to take user input

public class ConvertToUpperCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.println("Enter a statement:"); // Prompting the user to enter a statement
        String input = scanner.nextLine(); // Reading the user's input

        String upperCase = convertToUpperCase(input); // Calling the method to convert to uppercase

        System.out.println("Statement in uppercase: " + upperCase); // Printing the converted statement
    }

    public static String convertToUpperCase(String input) {
        char[] characters = input.toCharArray(); // Convert string to character array

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 'a' && characters[i] <= 'z') {
                // Checking if the character is a lowercase letter
                // If so, convert it to uppercase
                characters[i] = (char) (characters[i] - 32);
            }
        }

        return new String(characters); // Convert character array back to string
    }
}

