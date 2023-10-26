//WRITE A PROGRAM TO FIND THE SUM OF ALL THE INTEGERS GREATER THAN 40 AND LESS THAN 250 THAT ARE DIVISIBLE BY 5

package EXPERIMENT_2;

public class sum_of_all_integers {
		 public static void main(String arg[]){
		        int sum=0;
		        //for-loop for numbers 40-250
		        for(int i=40;i<250;i++){
		            // condition to check if number should be divided by 5
		            if(i%5==0){
		                //individual number which are selected in loop
		                System.out.println(i);
		                //adding values of array so that total sum can be calculated
		                sum=sum+i;   
		            }   
		        }
		        //final display output for the code 
		        System.out.println("the sum of intergers from 40 to 250 that are divisible by 5 \n"+sum);
		    }

	}

