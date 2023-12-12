//Write a program to implement the concept of threading by extending Thread Class and Runnable interface.


package EXPERIMENT_8; // Package declaration

class MyThread extends Thread { // Define a class MyThread that extends Thread
    public void run() { // Override the run() method
        for (int i = 1; i <= 5; i++) { // Start a loop from 1 to 5
            System.out.println("Thread A: " + i); // Print a message with the current value of i
        }
    }
}

class Main { // Define a class named Main
    public static void main(String[] args) { // Define the main method
        MyThread threadA = new MyThread(); // Create an instance of MyThread
        threadA.start(); // Start the thread

        for (int i = 1; i <= 5; i++) { // Start a loop from 1 to 5
            System.out.println("Main Thread: " + i); // Print a message with the current value of i
        }
    }
}
