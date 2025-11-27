import java.sql.*;
import java.util.Scanner;
public class Myudate1 {
    public static void main(String[] args)  throws Exception{
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection cn=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/classwork1", 
            "root",
            "Rajat@123");
            PreparedStatement p=cn.prepareStatement("update emp set ename= ?,city=?,salary=? where eno=?");
            while(true)
           {
            System.out.println("enter the ename");
            String ename=sc.nextLine();
            System.out.println("enter the city");
            String city=sc.nextLine();
            System.out.println("enter the salary");
            int salary=sc.nextInt();
            System.out.println("enter the eno");
            int eno=sc.nextInt();


            


            p.setString(1, ename);
            p.setString(2, city);
            p.setInt(3, salary);
              p.setInt(4, eno);
        
             
                
                int v=p.executeUpdate();
                System.out.println(v+"  updated");
                
               
            }


        
    }

    
}
