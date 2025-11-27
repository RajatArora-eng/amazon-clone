import java.sql.*;
import java.util.*;
import java.util.Base64.Encoder;

public class login {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Step 1: JDBC Driver Load
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Connection Establish
        Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1",
                "root",
                "Rajat@123"
        );

        while (true) {
            System.out.print("Enter email or mobile: ");
            String emailOrMobile = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();
            byte[] b = password.getBytes();
           Encoder en = Base64.getEncoder();
            String y = en.encodeToString(b);

            // Corrected query with proper brackets
            String query = "SELECT * FROM users WHERE (email = ? OR mobile = ?) AND password = ?";

            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, emailOrMobile);
            pst.setString(2, emailOrMobile);  
            pst.setString(3, y);
           
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int uid = rs.getInt("uid");
                String uname = rs.getString("uname");

                System.out.println("✅ Login Successful!");
                System.out.println("👤 User ID: " + uid);
                System.out.println("🧑 Name: " + uname);
                break;
            } else {
                System.out.println("❌ Invalid email/mobile or password. Try again.\n");
            }
        }

        sc.close();
        cn.close();
    }
}
