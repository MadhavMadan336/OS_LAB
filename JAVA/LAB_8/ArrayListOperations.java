//Write a program for the following:
//Read all elements from ArrayList by using Iterator.
//Create duplicate object of an ArrayList instance.
//Reverse ArrayList content.


package QUESTION_5; // Define a package named QUESTION_5

import java.util.ArrayList; // Import the ArrayList class
import java.util.Iterator; // Import the Iterator interface
import java.util.Collections; // Import the Collections class

public class ArrayListOperations { // Define a public class named ArrayListOperations
    public static void main(String[] args) { // Define the main method
        // Task 1: Create an ArrayList and add elements
        ArrayList<Integer> originalList = new ArrayList<>(); // Create an ArrayList of Integers named originalList
        originalList.add(1); // Add the integer 1 to the list
        originalList.add(2); // Add the integer 2 to the list
        originalList.add(3); // Add the integer 3 to the list
        originalList.add(4); // Add the integer 4 to the list
        originalList.add(5); // Add the integer 5 to the list

        // Task 2: Read all elements from ArrayList by using Iterator
        System.out.println("Original List:"); // Print a message indicating the original list
        Iterator<Integer> iterator = originalList.iterator(); // Create an Iterator for the originalList
        while (iterator.hasNext()) { // Loop as long as there are elements in the list
            System.out.println(iterator.next()); // Print the next element in the list
        }

        // Task 3: Create duplicate object of an ArrayList instance
        ArrayList<Integer> duplicateList = new ArrayList<>(originalList); // Create a duplicate ArrayList with the same elements as originalList

        // Task 4: Reverse ArrayList content
        Collections.reverse(duplicateList); // Reverse the content of the duplicateList

        // Print the reversed list
        System.out.println("\nReversed List:"); // Print a message indicating the reversed list
        for (Integer element : duplicateList) { // Iterate through the elements of the reversed list
            System.out.println(element); // Print each element
        }
    }
}
