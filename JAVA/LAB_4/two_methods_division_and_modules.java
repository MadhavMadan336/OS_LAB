//WRITE A PROGRAM TO CREATE AN INTERFACE HAVING TWO METHODS DIVISION AND MODULES. CREATE A CLASS, WHICH OVERRIDES THESE METHODS

package EXPERIMENT_4;

//Interface 'course' with methods 'division' and 'modules'
interface course {
 void division(int a);
 void modules(int b);
}

//Class 'stud' implementing 'course' interface
class stud implements course {
 String name;
 int div, mod;

 // Method to set the name
 void name(String n) {
     name = n;
 }

 // Implementation of 'division' from 'course' interface
 public void division(int a) {
     div = a;
 }

 // Implementation of 'modules' from 'course' interface
 public void modules(int b) {
     mod = b;
 }

 // Method to display student information
 void disp() {
     System.out.println("Name: " + name);
     System.out.println("Division: " + div);
     System.out.println("Modules: " + mod);
 }
}

//Main class
public class two_methods_division_and_modules {
 public static void main(String args[]) {
     stud s = new stud(); // Create an instance of 'stud'

     s.name("SGS2006"); // Set the name
     s.division(5);  // Set the division
     s.modules(15);  // Set the modules

     s.disp();  // Display student information
 }
}
