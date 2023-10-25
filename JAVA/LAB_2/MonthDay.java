//WRITE A PROGRAM TO INPUT A NUMBER OF A MONTHS (1-12) AND PRINT IT'S EQUIVALENT NAME OF A MONTH

package EXPERIMENT_2;
import java.util.Scanner;
public class MonthDay {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Month Number(1-12) :");
		int num = input.nextInt();			
		if(num==1)
			System.out.println("This is a January");
		else if(num==2)
			System.out.println("This is a February");
		else if(num==3)
			System.out.println("This is a March");
		else if(num==4)
			System.out.println("This is a April");
		else if(num==5)
			System.out.println("This is a May");
		else if(num==6)
			System.out.println("This is a June");
		else if(num==7)
			System.out.println("This is a July");
		else if(num==8)
			System.out.println("This is a August");
		else if(num==9)
			System.out.println("This is a September");
		else if(num==10)
			System.out.println("This is a October");
		else if(num==11)
			System.out.println("This is a November");
		else if(num==12)
			System.out.println("This is a December");
		else
			System.out.println("Enter 1 to 12...");
	}

}
