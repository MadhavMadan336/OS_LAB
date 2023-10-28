//WRITE A PROGRAM TO EXCEPT 10 STUDENTS MARKS IN AN ARRAY,ARRANGE IT INTO ASCENDING ORDER,CONVERT INTO THE FOLLOWING GRADES AND PRINT MARKS AND GRADES INTO TABULAR FORM BETWEEN 40-50 PASS,51-75 MARIT,ABOVE 75 DISTINCTION IN JAVA

	package EXPERIMENT_2;

	import java.util.Scanner;
	import java.util.Arrays;

	public class ten_student_marks_in_an_array {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner sc = new Scanner(System.in);
	        
	        // Create an array to store marks of 10 students
	        int[] marks = new int[10];
	        
	        // Input marks
	        System.out.println("Enter marks for 10 students:");
	        for (int i = 0; i < 10; i++) {
	            marks[i] = sc.nextInt();
	        }
	        
	        // Sort the marks in ascending order
	          Arrays.sort(marks);
	        
	        // Print marks and grades in tabular form
	        System.out.println("\nMarks\tGrade");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(marks[i] + "\t"); // Print the mark
	            
	            // Determine the grade based on the mark
	            if (marks[i] < 40 && marks[i] >= 0) {
	                System.out.println("Fail");
	            } else if (marks[i] >= 40 && marks[i] <= 50) {
	                System.out.println("PASS");
	            } else if (marks[i] >= 51 && marks[i] <= 75) {
	                System.out.println("MERIT");
	            } else if (marks[i] > 75) {
	                System.out.println("DISTINCTION");
	            }
	        }
	    }
	}


