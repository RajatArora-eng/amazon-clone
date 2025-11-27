import java.io.*;
public class test2 {
    public static void main(String[] args) {
   
       // File fs1=new File(ra/Documents/vs "/Users/rajatarocode programs/java codes");
        File fs2=new File("/Users/rajatarora/Desktop/res.java");
        try {
            if(fs2.createNewFile())
            System.out.println("already exist");
             // fs2.delete();
                
                else
                {
                  //  boolean b=fs2.mkdirs();
                    System.out.println("gg");
                }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
}

