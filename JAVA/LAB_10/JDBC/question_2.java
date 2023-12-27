//Create a database of employee of company in mysql and then use java program to access the database for inserting information of employees in database. The SQL statement can be used to view the details of the data of employees in the database.


package JDBC.LAB_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class question_2 {
    public static void main(String[] args) {
        Connection connection = null; // Create a connection object and initialize it to null
        Statement statement = null; // Create a statement object and initialize it to null

        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhav", "root", "1234");

            // Create a statement object
            statement = connection.createStatement();

            // Insert data into the employees table
            String insertDataSQL = "INSERT INTO Bhavya (first_name, last_name, email, department, salary) " +
                    "VALUES ('mohan', '2005', 'raj8@gmail.com', 't.s', 55000.00)";
            int rowsAffected = statement.executeUpdate(insertDataSQL);

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!"); // Print a success message if data is inserted
            } else {
                System.out.println("Data insertion failed."); // Print a failure message if data insertion fails
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Print an error message if an exception occurs
            e.printStackTrace(); // Print the stack trace of the exception
        } finally {
            try {
                if (statement != null) statement.close(); // Close the statement if it's not null
                if (connection != null) connection.close(); // Close the connection if it's not null
            } catch (Exception e) {
                e.printStackTrace(); // Print the stack trace of any exceptions that occur during closing
            }
        }
    }
}
