//Write a program to make a package Balance in which has Account class with Display_Balance method in it. Import Balance package in another program to access Display_Balance method of Account class.

package Balance;
import Balance.Account;

// Main class to demonstrate the usage of the Account class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Account with an initial balance of 20000
        Account myAccount = new Account(20000);
        
        // Displaying the balance
        myAccount.Display_Balance();
    }
}
