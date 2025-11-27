import java.sql.*;
import java.util.Scanner;


public class quiz {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classwork1", 
                    "root",
                    "Rajat@123");
                    String query = "INSERT INTO quiz (qno, question, option1, option2, option3, option4, answer) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = cn.prepareStatement(query);
                    while (true) {
                        System.out.println("enter te qno");
                        int qno=sc.nextInt();
                        sc.nextLine();
                      
                        System.out.println("enter the question");
                        String question=sc.nextLine();
                        System.out.println("enter the option 1");
                        String option1=sc.nextLine();
                        System.out.println("enter the option2");
                        String option2=sc.nextLine();
                        System.out.println("enter the option3");
                        String option3=sc.nextLine();
                        System.out.println("enter the option4");
                        String option4=sc.nextLine();
                        System.out.println("enter the answer");
                        String answer=sc.nextLine();




                        
                    
                    pst.setInt(1, qno);
                   pst.setString(2, question);
                    pst.setString(3, option1);
                    pst.setString(4, option2);
                    pst.setString(5, option3);
                    pst.setString(6, option4);
                    pst.setString(7, answer);
                    
   
                    int x = pst.executeUpdate();
                    System.out.println(x + " row inserted successfully");
                   System.out.println("enter the zero to stop or any other number to continue ");
                   int y=sc.nextInt();
                   if (y==0)
                   break;
   
                }
        } 
            

        }
    }
            


        
  

    

