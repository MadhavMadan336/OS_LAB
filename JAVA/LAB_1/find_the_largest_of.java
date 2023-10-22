//WRITE A PROGRAM TO FIND THE LARGEST OF 3 NUMBERS 

package EXPERIMENT_1;

public class find_the_largest_of {
	static int BiggestOfThree(int x,int y,int z)
    {
        return z>(x>y?x:y) ? z:((x>y?x:y));
    }
    public static void main(String[] args)// Main Function//
     {
        int a,b,c; //Declaring values//
        a=5;b=4;c=6;//Calling the largest number//
        int lar=BiggestOfThree(a,b,c);
        System.out.println("The largest number is "+ lar);
		
	}

}
