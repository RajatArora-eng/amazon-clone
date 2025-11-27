import java.io.*;
import java.sql.*;

public class Empinsert {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
    
            
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classwork1", 
                    "root", 
                    "Rajat@123"
              
            );
            PreparedStatement st = cn.prepareStatement("insert into emp (eno, ename, city, salary) values (?, ?, ?, ?)");



            BufferedReader br=new BufferedReader(new FileReader("emp.txt"));
            String str=br.readLine();
            while(str!=null)
            {
                str=  str.trim();
                String[] x= str.split("-");
                for (int i = 0; i < x.length; i++) {
                    x[i] = x[i].trim();
                }
             
            
                 st.setInt(1,Integer.parseInt(x[0]));
                 st.setString(2,x[1]);
                 st.setString(3,x[2]);
                 st.setLong(4,Integer.parseInt(x[3]));

                 st.executeUpdate();
                 str=br.readLine();

            }
            cn.close();
            br.close();
    }
    
}
