import java.io.*;
public class hike 

{
    public static void main(String[] args)throws IOException
    {
        System.out.println("hello ");
    

    File f=new File("/Users/rajatarora/Documents/vs code programs/java codes/Circle.txt");
    if (f.exists()) { // Check if file exists before deleting
        if (f.delete()) {
            System.out.println("File deleted successfully: " + f.getAbsolutePath());
        } else {
            System.out.println("Failed to delete the file.");
        }
    } else {
        System.out.println("File does not exist.");
    }
}
}
