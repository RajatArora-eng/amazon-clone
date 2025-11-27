import java.sql.*;
import java.io.*;

public class imgload {
    public static void main(String[] args) {
        try (
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1",  
                "root",
                "Rajat@123");
            FileInputStream fi = new FileInputStream("/Users/rajatarora/Desktop/Screenshot 2025-04-10 at 4.11.45 PM.png")
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            byte[] b = fi.readAllBytes();
            System.out.println("📷 Image size (bytes): " + b.length); 

            PreparedStatement p = cn.prepareStatement("UPDATE emp SET img=? WHERE eno=?");
            p.setBytes(1, b);
            p.setInt(2, 5);  
            int rows = p.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Image uploaded successfully to employee eno = 4.");
            } else {
                System.out.println("❌ Employee with eno = 2 not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
