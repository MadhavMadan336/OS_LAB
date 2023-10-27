//WRITE A PROGRAM TO EXCEPT 10 NUMBERS IN AN ARRAY AND COMPUTE SQUARE OF EACH NUMBER, FURTHER PRINT THE SUM OF THESE NUMBERS

package EXPERIMENT_2;
	import java.util.Scanner;

	public class ten_number_in_array_and_compute_square_of_each_number {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] n = new int[10];

	        // Input numbers into the array
	        System.out.println("Enter 10 numbers:");
	        for (int i = 0; i < 10; i++) {
	            n[i] = sc.nextInt();
	        }

	        // Calculate the square of each number
	        for (int i = 0; i < 10; i++) {
	            n[i] = n[i] * n[i];
	        }

	        // Calculate the sum of squares
	        int sum = 0;
	        for (int i = 0; i < 10; i++) {
	            sum += n[i];
	        }

	        // Print the sum
	        System.out.println("Sum of squares: " + sum);
	    }
	}

