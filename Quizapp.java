/**
 * The Quizapp class is a Java program that allows users to update or delete quiz questions stored in a
 * MySQL database.
 */
import java.sql.*;
import java.util.Scanner;

public class Quizapp {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1", 
                "root", 
                "Rajat@123"
        );

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Update a Question");
            System.out.println("2. Delete a Question");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                updateQuestion(cn, sc);
            } else if (choice == 2) {
                deleteQuestion(cn, sc);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        cn.close();
        sc.close();
    }

    public static void updateQuestion(  Connection cn, Scanner sc) throws Exception {
        System.out.println("enter the qno for update");
        int qno = Integer.parseInt(sc.nextLine());
        String selectQuery = "SELECT * FROM quiz WHERE qno=?";
        PreparedStatement selectPst = cn.prepareStatement(selectQuery);
        selectPst.setInt(1, qno);
        ResultSet rs = selectPst.executeQuery();
    
        if (rs.next()) {
            System.out.println("Existing Question:");
            System.out.println("Qno: " + rs.getInt("qno"));
            System.out.println("Question: " + rs.getString("question"));
            System.out.println("Option 1: " + rs.getString("option1"));
            System.out.println("Option 2: " + rs.getString("option2"));
            System.out.println("Option 3: " + rs.getString("option3"));
            System.out.println("Option 4: " + rs.getString("option4"));
            System.out.println("Answer: " + rs.getString("answer"));
    


        

        System.out.print("Enter new question text: ");
        String question = sc.nextLine();
        System.out.print("Enter new option1: ");
        String opt1 = sc.nextLine();
        System.out.print("Enter new option2: ");
        String opt2 = sc.nextLine();
        System.out.print("Enter new option3: ");
        String opt3 = sc.nextLine();
        System.out.print("Enter new option4: ");
        String opt4 = sc.nextLine();
        System.out.print("Enter correct answer: ");
        String answer = sc.nextLine();

        String query = "UPDATE quiz SET question=?, option1=?, option2=?, option3=?, option4=?, answer=? WHERE qno=?";
        PreparedStatement pst = cn.prepareStatement(query);
        pst.setString(1, question);
        pst.setString(2, opt1);
        pst.setString(3, opt2);
        pst.setString(4, opt3);
        pst.setString(5, opt4);
        pst.setString(6, answer);
        pst.setInt(7, qno);

        int updated = pst.executeUpdate();
        if (updated > 0) {
            System.out.println(" Question updated successfully.");
        } else {
            System.out.println(" Question not found.");
        }

    }
    }

    public static void deleteQuestion(Connection cn, Scanner sc) throws Exception {
        System.out.print("Enter question number to delete: ");
        int qno = Integer.parseInt(sc.nextLine());
        String selectQuery = "SELECT * FROM quiz WHERE qno=?";
        PreparedStatement selectPst = cn.prepareStatement(selectQuery);
        selectPst.setInt(1, qno);
        ResultSet rs = selectPst.executeQuery();
    
        if (rs.next()) {
            System.out.println("Existing Question:");
            System.out.println("Qno: " + rs.getInt("qno"));
            System.out.println("Question: " + rs.getString("question"));
            System.out.println("Option 1: " + rs.getString("option1"));
            System.out.println("Option 2: " + rs.getString("option2"));
            System.out.println("Option 3: " + rs.getString("option3"));
            System.out.println("Option 4: " + rs.getString("option4"));
            System.out.println("Answer: " + rs.getString("answer"));
            
            System.out.print("Are you sure you want to delete this question? (yes/no): ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {

        String query = "DELETE FROM quiz WHERE qno=?";
        PreparedStatement pst = cn.prepareStatement(query);
        pst.setInt(1, qno);

        int deleted = pst.executeUpdate();
        if (deleted > 0) {
            System.out.println(" Question deleted successfully.");
        } else {
            System.out.println("Question not found.");
        }

        pst.close();
    }
}
    }
}
