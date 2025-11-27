import java.sql.*;
import java.util.Scanner;
public class mydb3 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1", 
                "root",
                "Rajat@123");
            Statement st =cn.createStatement();

            
            
           /*  System.out.println(" enter the eno");
           int eno= sc.nextInt();
            System.out.println("enter the ename");
           String ename= sc.next();
            System.out.println("enter the city");
            String city=sc.next();
            System.out.println("enter the salary");
            int salary=sc.nextInt();
            city+"',"+salary+")"int x=st.executeUpdate("insert into emp(eno,ename,city,salary)values("+eno+",'"+ename+"','"+);*/
            System.out.print("Enter Employee Number (eno) to delete: ");
            int eno = sc.nextInt();
            int x = st.executeUpdate("delete from emp where eno = " + eno);
            




            

            
            System.out.println("delete succesfuly");

            cn.close();


        
    }
    
}
