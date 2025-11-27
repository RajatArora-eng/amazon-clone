import java.sql.*;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to MySQL
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1", "root", "Rajat@123"
            );

            int choice;
            do {
                System.out.println("\n===== Employee Manager =====");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // Insert Employee
                        System.out.print("Enter Employee No (eno): ");
                        int eno = sc.nextInt();
                        sc.nextLine(); // clear buffer

                        System.out.print("Enter Name: ");
                        String ename = sc.nextLine();

                        System.out.print("Enter City: ");
                        String city = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        int salary = sc.nextInt();

                        String insertQuery = "INSERT INTO emp VALUES (?, ?, ?, ?)";
                        PreparedStatement pst = cn.prepareStatement(insertQuery);
                        pst.setInt(1, eno);
                        pst.setString(2, ename);
                        pst.setString(3, city);
                        pst.setInt(4, salary);

                        int rows = pst.executeUpdate();
                        if (rows > 0) {
                            System.out.println("✅ Employee added successfully!");
                        }
                        break;

                    case 2:
                        // Show All Employees
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM emp");

                        System.out.println("\n--- Employee List ---");
                        while (rs.next()) {
                            System.out.println("Eno: " + rs.getInt("eno")
                                + ", Name: " + rs.getString("ename")
                                + ", City: " + rs.getString("city")
                                + ", Salary: " + rs.getInt("salary"));
                        }
                        break;

                    case 3:
                        System.out.println("👋 Exiting program. Goodbye!");
                        break;

                    default:
                        System.out.println("❌ Invalid choice! Please try again.");
                }
            } while (choice != 3);

            cn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}
