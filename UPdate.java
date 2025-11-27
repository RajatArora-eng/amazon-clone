
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class UPdate {

	public static void main(String[] s) {
		try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Rajat@123");
		  Statement st = con.createStatement();
		  //java.util.Scanner sc = new java.util.Scanner(System.in);
		//	System.out.println("Enter  number");
			//int id = sc.nextInt();

			//		sc.nextLine();
			//System.out.println("Enter  name");

			//String ename = sc.nextLine();
	 		//System.out.println("Enter City");

			//String empcity = sc.nextLine();
			//System.out.println("Enter Salary");
			
		  	//int empsalary = sc.nextInt();
		  			//sc.nextLine();
		 // ResultSet rs =st.executeQuery("select empCITY, Count(*), sum ");
	
		  ResultSet rs =st.executeQuery("SELECT  classwork.emp.*, classwork.empqualification.*from(classwork.emp  inner join    mydb.empquali on employ.empID = empquali.enoqua);");
			while(rs.next()) {
				System.out.println(rs.getInt("empID")+","+ rs.getString("empname") +"," + rs.getString("empCITY")+ ","+ rs.getInt("empsalary")+","+ rs.getInt("empage")+"," +rs.getInt("enoqua") +","+rs.getInt("yop"));
			}

			 
			
		  System.out.println("data Inserted.....");
		}
		catch( Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}

}
