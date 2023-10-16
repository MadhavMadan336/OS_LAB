//WRITE A PROGRAM USING CLASSES AND OBJECT IN JAVA

package EXPERIMENT_1;
	import java.util.Scanner;

	// Define a class called Person
	class Person {
	    // Fields
	    String name;
	    int age;

	    // Constructor to initialize the name and age
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to print information about the person
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	public class a_program_using_classes_and_object_in_java {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter name and age
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();

	        // Create an instance of the Person class
	        Person person = new Person(name, age);

	        // Call the displayInfo method to print information about the person
	        person.displayInfo();
	    }
	}



