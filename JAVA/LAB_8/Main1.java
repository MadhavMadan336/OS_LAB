//Write a program to implement the concept of threading by extending Thread Class and Runnable interface

package EXPERIMENT_8; // Package declaration

class MyRunnable implements Runnable { // Define a class MyRunnable that implements the Runnable interface
    public void run() { // Override the run() method
        for (int i = 1; i <= 5; i++) { // Start a loop from 1 to 5
            System.out.println("Runnable Thread: " + i); // Print a message with the current value of i
        }
    }
}

class Main1 { // Define a class named Main1
    public static void main(String[] args) { // Define the main method
        MyRunnable myRunnable = new MyRunnable(); // Create an instance of MyRunnable
        Thread threadB = new Thread(myRunnable); // Create a new Thread and pass myRunnable as the target
        threadB.start(); // Start the thread

        for (int i = 1; i <= 5; i++) { // Start a loop from 1 to 5
            System.out.println("Main Thread: " + i); // Print a message with the current value of i
        }
    }
}


