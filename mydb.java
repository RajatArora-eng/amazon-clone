import java.sql.*;
public class mydb {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1", 
                "root",
                "Rajat@123");
            Statement st =cn.createStatement();
          int x=st.executeUpdate("select ename ,salary from emp where salary>=9000");
           
            


        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("invalid driver");
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

    }
    
}
