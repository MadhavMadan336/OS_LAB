//Write a program for the following HashSet
//• copy another collection object to HashSet object.
//• delete all entries at one call from HashSet
//• search user defined objects from HashSet

package QUESTION_6; // Define a package named QUESTION_6

import java.util.HashSet; // Import the HashSet class
import java.util.ArrayList; // Import the ArrayList class

class UserDefinedObject { // Define a class named UserDefinedObject
    private String name; // Define a private String variable named name

    public UserDefinedObject(String name) { // Define a constructor that takes a String parameter
        this.name = name; // Initialize the name variable with the provided parameter
    }

    public String getName() { // Define a method to get the name
        return name; // Return the value of the name variable
    }

    @Override
    public int hashCode() { // Override the hashCode method
        return name.hashCode(); // Return the hashCode of the name
    }

    @Override
    public boolean equals(Object obj) { // Override the equals method
        if (this == obj) // If the objects are the same
            return true; // Return true
        if (obj == null || getClass() != obj.getClass()) // If the classes are not the same
            return false; // Return false
        UserDefinedObject other = (UserDefinedObject) obj; // Cast the object to UserDefinedObject
        return name.equals(other.name); // Return true if the names are equal, otherwise false
    }
}

public class HashSetOperations { // Define a public class named HashSetOperations
    public static void main(String[] args) { // Define the main method
        // Task 1: Copy another collection object to HashSet object
        HashSet<String> hashSet = new HashSet<>(); // Create a HashSet of Strings named hashSet

        // Create an ArrayList and add elements
        ArrayList<String> arrayList = new ArrayList<>(); // Create an ArrayList of Strings named arrayList
        arrayList.add("apple"); // Add "apple" to the list
        arrayList.add("banana"); // Add "banana" to the list
        arrayList.add("cherry"); // Add "cherry" to the list

        hashSet.addAll(arrayList); // Add all elements from the ArrayList to the HashSet

        // Print HashSet
        System.out.println("HashSet after copying from ArrayList:"); // Print a message indicating the operation
        System.out.println(hashSet); // Print the contents of the HashSet

        // Task 2: Delete all entries at one call from HashSet
        hashSet.clear(); // Clear all entries from the HashSet

        // Print HashSet after clearing
        System.out.println("\nHashSet after clearing:"); // Print a message indicating the operation
        System.out.println(hashSet); // Print the contents of the HashSet after clearing

        // Task 3: Search user defined objects from HashSet
        HashSet<UserDefinedObject> userHashSet = new HashSet<>(); // Create a HashSet of UserDefinedObjects
        UserDefinedObject user1 = new UserDefinedObject("John"); // Create a UserDefinedObject named user1 with name "John"
        UserDefinedObject user2 = new UserDefinedObject("Jane"); // Create a UserDefinedObject named user2 with name "Jane"

        userHashSet.add(user1); // Add user1 to the HashSet
        userHashSet.add(user2); // Add user2 to the HashSet

        UserDefinedObject searchUser = new UserDefinedObject("John"); // Create a UserDefinedObject named searchUser with name "John"

        System.out.println("\nSearching for user 'John': " + userHashSet.contains(searchUser)); // Print whether the HashSet contains searchUser
    }
}
