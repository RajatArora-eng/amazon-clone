import java.io.*;
public class path {
    public static void main(String[] args) {
        File f =new File("/Users/rajatarora/Documents/vs code programs/java codes");
        System.out.println(f.length());
        String[] str =f.list();
        for(String v : str)
        {
            System.out.println(v);
        }

        
        
    }
    
}
