import java.util.*;


public class MapTest3 {
    public static void main(String[] args) {
        HashMap<String, student> eMap = new HashMap<>();
        student std;
        try {
            // Initialize ReadEmp class to read the student.txt file
            ReadEmp re = new ReadEmp();
            String x = re.getstudent(); // Use getstudent() to read from student.txt

            // Loop through all lines in the file
            while (x != null) {
                System.out.println("Reading: " + x);  // Debugging line

                String[] y = x.split("-");

                // Check if there are exactly 6 fields (expected in student.txt)
                if (y.length != 6) {
                    System.out.println("Invalid line: " + x);  // Print invalid lines
                    x = re.getstudent();  // Move to the next line
                    continue;
                }

                // Trim any extra spaces from the data
                for (int i = 0; i < y.length; i++) {
                    y[i] = y[i].trim();
                }

                // Create a student object with the data
                std = new student(Integer.parseInt(y[0]), y[1], y[2], Double.parseDouble(y[3]), y[4].trim(), y[5]);
                eMap.put(y[0], std);  // Add the student to the map

                // Read next line
                x = re.getstudent();
            }

            re.close();  // Close the BufferedReader

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Example: Print default student if not found
        student st = new student(1, "****", "6", 887.8, "shhs", "ghhdhd");
        System.out.println(eMap.getOrDefault("104", st));  // Default value if key "104" not found
        System.out.println(eMap.get("1"));  // Print student with roll number "1"

        // Modify student with roll number "101" by increasing the percentage
        std = eMap.compute("101", (k, v) -> new student(v.rollNo, v.name, v.studentClass, v.percentage + 200.00, v.email, v.address));
        System.out.println(std);  // Print the updated student
    }
}
