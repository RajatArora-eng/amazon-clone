  import java.sql.*;

public class PaysheetDisplay {
    public static void main(String[] args) throws Exception {

        int mm = 4; 
        int yy = 2025;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/classwork1", 
            "root", 
            "Rajat@123");

        String sql = "SELECT emp.eno, emp.ename, emp.city, pay.salary, pay.da, pay.ta, pay.hra, pay.gross " +
                     "FROM emp INNER JOIN paymaster pay ON emp.eno = pay.eno " +
                     "WHERE pay.month = ? AND pay.year = ?";

        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setInt(1, mm);
        ps.setInt(2, yy);

        ResultSet rs = ps.executeQuery();

       
        System.out.println("Paysheet for " + mm + "/" + yy);
        System.out.printf("%-5s %-5s %-10s %-10s %-10s %-11s %-11s %-11s %-15s\n", 
                          "S.No", "ENO", "ENAME", "CITY", "SALARY", "DA", "TA", "HRA", "GROSS");
        System.out.println("-----------------------------------------------------------------------------------------");
        double totalSalary = 0, totalDA = 0, totalTA = 0, totalHRA = 0, totalGross = 0;
        int count = 0;

        while (rs.next()) {
            count++;
            int eno = rs.getInt("eno");
            String ename = rs.getString("ename");
            String city = rs.getString("city");
            double salary = rs.getDouble("salary");
            double da = rs.getDouble("da");
            double ta = rs.getDouble("ta");
            double hra = rs.getDouble("hra");
            double gross = rs.getDouble("gross");

            totalSalary += salary;
            totalDA += da;
            totalTA += ta;
            totalHRA += hra;
            totalGross += gross;

            System.out.printf("%-5d %-5d %-10s %-10s %-10.2f %-11.2f %-11.2f %-11.2f %-15.2f\n",
                              count, eno, ename, city, salary, da, ta, hra, gross);
        }

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-30s %-13.2f %-11.2f %-11.2f %-11.2f %-11.2f\n", 
                          "Total", totalSalary, totalDA, totalTA, totalHRA, totalGross);

       
        System.out.println("Total Gross in Words: " + Mywords.convertToIndianWords((long) totalGross) + " only");

        cn.close();
    }
}
