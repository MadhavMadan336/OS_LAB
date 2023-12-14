//Write a Java program to create five threads with different priorities. Send two threads of the highest priority to sleep state. 

package QUESTION_4; // Define a package named QUESTION_4

class PriorityRunnable implements Runnable { // Define a class named PriorityRunnable that implements the Runnable interface
    public void run() { // Implement the run() method
        for (int i = 1; i <= 5; i++) { // Loop from i = 1 to i = 5
            System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
            // Print the name of the current thread, along with its priority
        }
    }
}

