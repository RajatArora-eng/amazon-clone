import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeGUI extends JFrame implements ActionListener {
    // GUI Components
    JTextField t1, t2, t3, t4;
    JButton addBtn, viewBtn;
    JTextArea outputArea;

    Connection cn;

    // Constructor
    public EmployeeGUI() {
        setTitle("Employee Manager");
        setSize(400, 400);
        setLayout(new FlowLayout());

        // Connect to DB
        connectToDatabase();

        // Labels and Fields
        add(new JLabel("Employee No:"));
        t1 = new JTextField(20);
        add(t1);

        add(new JLabel("Name:"));
        t2 = new JTextField(20);
        add(t2);

        add(new JLabel("City:"));
        t3 = new JTextField(20);
        add(t3);

        add(new JLabel("Salary:"));
        t4 = new JTextField(20);
        add(t4);

        // Buttons
        addBtn = new JButton("Add Employee");
        viewBtn = new JButton("View All");

        add(addBtn);
        add(viewBtn);

        addBtn.addActionListener(this);
        viewBtn.addActionListener(this);

        // Output Area
        outputArea = new JTextArea(10, 30);
        add(new JScrollPane(outputArea));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classwork1", "root", "Rajat@123"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Connection Error: " + e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            try {
                int eno = Integer.parseInt(t1.getText());
                String name = t2.getText();
                String city = t3.getText();
                int salary = Integer.parseInt(t4.getText());

                PreparedStatement pst = cn.prepareStatement("INSERT INTO emp VALUES (?, ?, ?, ?)");
                pst.setInt(1, eno);
                pst.setString(2, name);
                pst.setString(3, city);
                pst.setInt(4, salary);

                int rows = pst.executeUpdate();
                if (rows > 0) {
                    JOptionPane.showMessageDialog(this, "Employee Added Successfully!");
                    clearFields();
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        } else if (e.getSource() == viewBtn) {
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM emp");

                outputArea.setText(""); // clear previous
                while (rs.next()) {
                    outputArea.append(
                        "Eno: " + rs.getInt("eno") + ", Name: " + rs.getString("ename")
                        + ", City: " + rs.getString("city") + ", Salary: " + rs.getInt("salary") + "\n"
                    );
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }

    public void clearFields() {
        t1.setText(""); t2.setText(""); t3.setText(""); t4.setText("");
    }

    public static void main(String[] args) {
        new EmployeeGUI();
    }
}

