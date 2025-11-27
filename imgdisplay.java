import java.io.FileOutputStream;
import java.sql.*;

public class imgdisplay {
    public static void main(String[] args) throws Exception {
      
        FileOutputStream fo = new FileOutputStream("/Users/rajatarora/Documents/Screenshot 2025-04-10 at 4.11.45 PM.png");

        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/classwork1", 
            "root",
            "Rajat@123"
        );

       
        PreparedStatement ps = cn.prepareStatement("SELECT img FROM emp WHERE eno = ?");
        ps.setInt(1, 5); 

        ResultSet rs = ps.executeQuery();

        
        if (rs.next()) {
            byte[] b = rs.getBytes("img");
            fo.write(b, 0, b.length);
            System.out.println("Image successfully saved to file.");
        } else {
            System.out.println("No image found for given employee number.");
        }

       
        fo.close();
        cn.close();
    }
}
