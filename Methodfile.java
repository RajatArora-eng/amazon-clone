import java.io.*;

class Methodfile {
    public static void main(String[] args) {
        try {
            // FileWriter को try-with-resources में रखना बेहतर है
            try (FileWriter f = new FileWriter("/Users/rajatarora/Desktop/r.txt")) {
                f.write("Java Programming is the best Language..!");
                System.out.println("Successfully wrote data in file");
            }
        } catch (IOException i) {
            System.out.println("Error occurred: " + i.getMessage());
        }
    }
}
