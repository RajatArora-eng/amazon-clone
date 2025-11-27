import java.sql.*;

public class Mydb2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classwork1", "root", "Rajat@123");

            Statement st = cn.createStatement();

            // ✅ INSERT Query
            //String insertQuery = "INSERT INTO emp VALUES (44, 'Ravi', 'Pune', 45000)";
          //  int rowsAffected = st.executeUpdate(insertQuery);

            //if (rowsAffected > 0) {
               // System.out.println("Record inserted successfully!");
           // }

            // ✅ SELECT Query
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM emp" );
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) );//+ ", " + rs.getString("ename") + ", " + 
                  //rs.getString(1) + ",  " + 
                 //  rs.getInt(2));
            }

            cn.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Invalid driver");
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
