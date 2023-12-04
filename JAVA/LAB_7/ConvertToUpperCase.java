//Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuilt function. 

package EXPERIMENT_7; // This is a package declaration. It's used to group related classes

public class ConvertToUpperCase {
    public static void main(String args[]) {
        // Initializing a string
        String input = "madhav madan";
        System.out.println("Lower case string is : " + input); // Printing the original string

        char strArr[] = input.toCharArray(); // Converting the string to a character array

        for (int i = 0; i < strArr.length; i++) {
            // Iterating through the character array
            // Here is the actual logic to convert lowercase letters to uppercase

            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32); // Converting lowercase letter to uppercase
            }
        }

        System.out.print("Upper case string is : ");

        // Printing the converted character array
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}
