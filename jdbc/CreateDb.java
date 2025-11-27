

import java.sql.*;
import javax.swing.JOptionPane;

public class CreateDb {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // MySQL ke JDBC URL me ek backslash galat tha, ab sahi hai
            String url = "jdbc:mysql://localhost:3306/";

            String databaseName = "my"; // tum yaha apna desired DB name de sakte ho
            String username = "root";
            String password = "Rajat@123"; // apne system ka password yaha daalo

            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // Connection establish karna MySQL server se (database specify nahi kiya abhi)
            Connection connection = DriverManager.getConnection(url, username, password);

            // SQL query to create database
            String sql = "CREATE DATABASE " + databaseName;

            // Statement create karna aur query run karna
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql); // yaha executeUpdate hona chahiye tha

            // Statement close karna
            statement.close();

            // Success message
            JOptionPane.showMessageDialog(null, "Database '" + databaseName + "' created successfully!");

        } catch (SQLException e) {
            // Agar koi error aaye toh woh yaha pakda jaayega
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
