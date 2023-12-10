//Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization.

package EXPERIMENT_8; // Package declaration

class Counter { // Define a class named Counter
    private int count = 0; // Initialize a private integer variable 'count' to 0

    public synchronized void increment() { // Define a synchronized method to increment 'count'
        count++;
    }

    public int getCount() { // Define a method to get the current value of 'count'
        return count;
    }
}

class IncrementThread extends Thread { // Define a class IncrementThread that extends Thread
    private Counter counter; // Declare a Counter object

    public IncrementThread(Counter counter) { // Constructor to initialize the Counter object
        this.counter = counter;
    }

    public void run() { // Override the run() method
        for (int i = 0; i < 1000; i++) { // Loop 1000 times
            counter.increment(); // Call the increment() method on the Counter object
        }
    }
}

public class launch_10_threads { // Define a class named launch_10_threads
    public static void main(String[] args) { // Define the main method
        Counter counter = new Counter(); // Create an instance of Counter

        IncrementThread[] threads = new IncrementThread[10]; // Create an array of IncrementThread objects

        for (int i = 0; i < 10; i++) { // Loop to create and start 10 threads
            threads[i] = new IncrementThread(counter); // Create an IncrementThread with the Counter object
            threads[i].start(); // Start the thread
        }

        for (int i = 0; i < 10; i++) { // Loop to join all threads
            try {
                threads[i].join(); // Wait for the thread to finish execution
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle any InterruptedException
            }
        }

        System.out.println("Final Count: " + counter.getCount()); // Print the final count
    }
}
