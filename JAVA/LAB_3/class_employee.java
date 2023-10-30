//DESIGN A CLASS EMPLOYEE OF AN ORGANIZATION. AN EMPLOYEE HAS A NAME, EMPID, AND SALARY. WRITE THE DEFAULT CONSTRUCTOR, A CONSTRUCTOR WITH PARAMETERS (NAME, EMPID, AND SALARY) AND METHODS TO RETURN NAME AND SALARY. ALSO WRITE A METHOD INCREASE SALARY THAT RAISES THE EMPLOYEE'S SALARY BY A CERTAIN USER SPECIFIED PERCENTAGE. DERIVE A SUBCLASS MANAGER FROM EMPLOYEE. ADD AN INSTANCE VARIABLE NAMED DEPARTMENT TO THE MANAGER CLASS. SUPPLY A TEST PROGRAM THAT USES THESES CLASSES AND METHODS.

package EXPERIMENT_3;
class Employee {
    String name;
    int empID;
    double salary;

    // Default constructor
    public Employee() {
        // Initialize with default values or leave them uninitialized, depending on the situation
    }

    // Constructor with parameters
    public Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    // Getter method to return the name
    public String getName() {
        return name;
    }

    // Getter method to return the salary
    public double getSalary() {
        return salary;
    }

    // Method to increase salary by a percentage
    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}

// Manager class extending Employee
class Manager extends Employee {
    String department;

    // Constructor with parameters, including department
    public Manager(String name, int empID, double salary, String department) {
        super(name, empID, salary);
        this.department = department;
    }

    // Getter method to return the department
    public String getDepartment() {
        return department;
    }
}

// Main class for testing
public class class_employee {
    public static void main(String[] args) {
        // Create an Employee
        Employee employee1 = new Employee("John Doe", 1001, 50000);

        // Print Employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Employee ID: " + employee1.empID);
        System.out.println("Salary: $" + employee1.getSalary());

        // Increase salary by 10%
        employee1.increaseSalary(10);
        System.out.println("New Salary after Increase: $" + employee1.getSalary());

        // Create a Manager
        Manager manager1 = new Manager("Jane Smith", 2001, 70000, "Operations");

        // Print Manager details
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager1.getName());
        System.out.println("Employee ID: " + manager1.empID);
        System.out.println("Salary: $" + manager1.getSalary());
        System.out.println("Department: " + manager1.getDepartment());

        // Increase salary by 15%
        manager1.increaseSalary(15);
        System.out.println("New Salary after Increase: $" + manager1.getSalary());
    }
}

