//WRITE A PROGRAM TO PRINT FIBONACCI SERIES USING LOOP

package EXPERIMENT_1;

public class print_Fibonacci_series_using_loop {

	public static void main(String[] args) {
		 int n = 20; // The number of Fibonacci numbers to generate

	        // Initialize the first two Fibonacci numbers
	        int first = 0;
	        int second = 1;

	        System.out.println("Fibonacci Series of " + n + " numbers:");

	        // Loop to generate and print the Fibonacci series
	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");

	            // Calculate the next Fibonacci number
	            int next = first + second;

	            // Update the values of first and second for the next iteration
	            first = second;
	            second = next;

	}

}
}
