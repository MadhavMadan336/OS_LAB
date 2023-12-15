//Write a Java program to create five threads with different priorities. Send two threads of the highest priority to sleep state. 

package QUESTION_4; // Define a package named QUESTION_4

public class ThreadPriorityExample { // Define a public class named ThreadPriorityExample
    public static void main(String[] args) { // Define the main method
        // Create five threads and assign names using PriorityRunnable
        Thread thread1 = new Thread(new PriorityRunnable(), "Thread 1");
        Thread thread2 = new Thread(new PriorityRunnable(), "Thread 2");
        Thread thread3 = new Thread(new PriorityRunnable(), "Thread 3");
        Thread thread4 = new Thread(new PriorityRunnable(), "Thread 4");
        Thread thread5 = new Thread(new PriorityRunnable(), "Thread 5");

        // Set priorities for each thread
        thread1.setPriority(Thread.MIN_PRIORITY); // Set thread1 to minimum priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Set thread2 to normal priority
        thread3.setPriority(Thread.NORM_PRIORITY); // Set thread3 to normal priority
        thread4.setPriority(Thread.MAX_PRIORITY); // Set thread4 to maximum priority
        thread5.setPriority(Thread.MAX_PRIORITY); // Set thread5 to maximum priority

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads 4 and 5 are now sleeping...");

        // No longer recommended to use suspend() - this is for demonstration purposes only
        thread4.suspend(); // Suspend thread4
        thread5.suspend(); // Suspend thread5

        System.out.println("Threads 4 and 5 are in sleep state.");
    }
}
