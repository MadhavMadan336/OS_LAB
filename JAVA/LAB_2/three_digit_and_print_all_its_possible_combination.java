//WRITE A PROGRAM TO EXCEPT THREE DIGITS (0-9) AND PRINT ALL ITS POSSIBLE COMBINATION. (For example, if the three digits are 1, 2, 3 than all possible combinations are: 123, 132, 213, 231, 312, 321.)

package EXPERIMENT_2;
	import java.util.Scanner;
	public class three_digit_and_print_all_its_possible_combination {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter three digits
	        System.out.println("Enter three digits (0-9): ");
	        int[] digits = new int[3];

	        // Read the three digits from the user
	        for (int i = 0; i < 3; i++) {
	            digits[i] = scanner.nextInt();
	        }

	        // Close the scanner since we have read all the input
	        scanner.close();

	        // Print all possible combinations
	        System.out.println("All possible combinations are:");
	        generatePermutations(digits);
	    }

	    // Function to generate permutations
	    private static void generatePermutations(int[] digits) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (i != j) {
	                    for (int k = 0; k < 3; k++) {
	                        if (k != i && k != j) {
	                            System.out.println("" + digits[i] + digits[j] + digits[k]);
	                        }
	                    }
	                }
	            }
	        }
	    }
	}
