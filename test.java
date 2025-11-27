import java.io.*;
public class test {

    public static void main(String[] args) {
        File[] f=File.listRoots();
        for(File x:f)
        {
            System.out.println(x);
        }
        
        
    }
}