import java.sql.*;
import java.time.*;

public class Paymaster {
    public static void main(String[] args) throws Exception {

        LocalDate dt = LocalDate.now();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();
        

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1",
                "root",
                "Rajat@123");

       
        PreparedStatement del = cn.prepareStatement("DELETE FROM paymaster WHERE month = ? AND year = ?");
        del.setInt(1, mm);
        del.setInt(2, yy);
        del.executeUpdate();

        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT eno, salary FROM emp");

        PreparedStatement p = cn.prepareStatement(
            "INSERT INTO paymaster (month, year, eno, salary, da, ta, hra, gross) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

        while (rs.next()) {
            int eno = rs.getInt("eno");
            int sal = rs.getInt("salary");

            double da = sal * 1.20;
            double ta = sal * 0.45;
            double hra = sal * 0.25;
            double gross = sal + da + ta + hra;

            p.setInt(1, mm);
            p.setInt(2, yy);
            p.setInt(3, eno);
            p.setInt(4, sal);
            p.setDouble(5, da);
            p.setDouble(6, ta);
            p.setDouble(7, hra);
            p.setDouble(8, gross);
            p.executeUpdate();
        }

        System.out.println("Paysheet generated & posted successfully");
       
        cn.close();
      }
      

    }

       
        