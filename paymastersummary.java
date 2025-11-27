import java.sql.*;
import java.time.*;

public class paymastersummary {
    public static void main(String[] args) throws Exception {

        LocalDate dt = LocalDate.now();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1",
                "root",
                "Rajat@123");

                PreparedStatement summaryStmt = cn.prepareStatement(
            "SELECT COUNT(*) , " +
            "SUM(salary),  " +
            "SUM(da) , " +
            "SUM(ta) , " +
            "SUM(hra) , " +
            "SUM(gross)  " +
            "FROM paymaster WHERE month = ? AND year = ?"
        );
        summaryStmt.setInt(1, mm);
        summaryStmt.setInt(2, yy);

        ResultSet summaryRs = summaryStmt.executeQuery();

        if (summaryRs.next()) {
            System.out.println("\nSummary for " + mm + "/" + yy);
            System.out.println("Total Employees: " + summaryRs.getInt(1));
            System.out.println("Total Basic Salary: " + summaryRs.getDouble(2));
            System.out.println("Total DA: " + summaryRs.getDouble(3));
            System.out.println("Total TA: " + summaryRs.getDouble(4));
            System.out.println("Total HRA: " + summaryRs.getDouble(5));

            double totalGross = summaryRs.getDouble(6);
            System.out.println("Total Gross Salary: " + totalGross);
            System.out.println("In Words: " + Mywords.convertToIndianWords((long) totalGross) + " only");
        }

        cn.close();
    }
}

    