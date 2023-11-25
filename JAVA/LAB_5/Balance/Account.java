//Write a program to make a package Balance in which has Account class with Display_Balance method in it. Import Balance package in another program to access Display_Balance method of Account class.

package Balance;

public class Account {
    private double balance;

    // Constructor to initialize the balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to display the balance
    public void Display_Balance() {
        System.out.println("Your balance is: " + balance);
    }
}
