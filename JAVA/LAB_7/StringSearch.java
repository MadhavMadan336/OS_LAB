//Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or substring.

package EXPERIMENT_7;
//Importing the necessary package to handle input/output operations
import java.io.*;

//Defining the class with the name 's08_03'
public class StringSearch {
 // The main method which is the entry point of the program
 public static void main(String[]args) throws Exception
 {
     // Declaring variables to store the lengths of the strings and the last occurrence position
     int len1,len2,last=0;
     // Creating an input stream to read user input
     DataInputStream in=new DataInputStream(System.in);
     // Prompting the user to enter the main string
     System.out.println("Enter the string:");
     // Reading the input string and storing it in the variable 's1'
     String s1=in.readLine();
     // Prompting the user to enter the substring to search for
     System.out.println("Enter searching string:");
     // Reading the substring to search for and storing it in the variable 's2'
     String s2=in.readLine();
     // Getting the lengths of the main string and the substring
     len1=s1.length();
     len2=s2.length();
     // Looping through the main string to search for occurrences of the substring
     for(int i=0;i<=(len1-len2);i++)
     {
         // Extracting a substring from the main string and comparing it with the search substring
         if(s1.substring(i,len2+i).equals(s2))
         {
             // If the substring matches, it means a occurrence is found
             // If 'last' is 0, this is the first occurrence
             if(last==0)
                 System.out.println("first occurance is at possition :"+(i+1));

             // Storing the position of the last occurrence
             last=i+1;
         }
     }

     // Checking if any occurrence was found
     if(last!=0)
         System.out.println("last occurance is at possition :"+last);
     else
         System.out.println("the string is not found");
 }
}
