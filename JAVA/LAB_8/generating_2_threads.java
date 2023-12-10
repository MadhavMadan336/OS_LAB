//Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.

package EXPERIMENT_8;

class EvenThread extends Thread { // Define a class EvenThread that extends Thread
    public void run() { // Override the run() method
        for (int i = 2; i <= 10; i += 2) { // Loop through even numbers from 2 to 10
            System.out.println("Even Thread: " + i); // Print the current even number
        }
    }
}

class OddThread extends Thread { // Define a class OddThread that extends Thread
    public void run() { // Override the run() method
        for (int i = 1; i <= 9; i += 2) { // Loop through odd numbers from 1 to 9
            System.out.println("Odd Thread: " + i); // Print the current odd number
        }
    }
}

public class generating_2_threads {// Define a class named Main
    public static void main(String[] args) { // Define the main method
        EvenThread evenThread = new EvenThread(); // Create an instance of EvenThread
        OddThread oddThread = new OddThread(); // Create an instance of OddThread

        evenThread.start(); // Start the even thread
        oddThread.start(); // Start the odd thread
    }
}
