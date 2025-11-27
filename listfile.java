import java.io.*;
public class listfile {
    public static void main(String[] args) {
        
    
   File f=new File("/Users/rajatarora/Documents/vs code programs/java codes");
    File[] fs=f.listFiles();
    for(File v: fs)
    {
        System.out.println(v);
        
    }
    System.out.println("is Directry "+f.isDirectory());
    System.out.println("is Directry "+f.isFile());

}
}