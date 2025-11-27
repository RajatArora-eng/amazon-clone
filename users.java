import java.sql.*;
import java.util.*;
import java.util.Base64.Encoder;

public class users {

 public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1", 
                "root", 
                "Rajat@123"

        );

        while (true) {
            System.out.println("enter the uid");
            int uid=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the uname");
            String uname=sc.nextLine();
            System.out.println("enter the email");
            String email=sc.nextLine();
            System.out.println(" enter the mobile");
            int mobile=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the password");
            String password= sc.nextLine();
            byte[] b = password.getBytes();
		    		 Encoder en = Base64.getEncoder();
		    		 String y = en.encodeToString(b);
                
            String query = "insert into users (uid ,uname,email,mobile,password) values(?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setInt(1, uid);
            pst.setString(2, uname);
            pst.setString(3, email);
            pst.setInt(4, mobile);
            pst.setString(5,y );
           

          
           
            int q=pst.executeUpdate();
            System.out.println(q+"inserted");
           
            System.out.println("if you want to terminate write a 0 or a continue write a any number");
            int x=sc.nextInt();
            if(x==0)
            break;

            
        }
        cn.close();
        
    }

    
}

