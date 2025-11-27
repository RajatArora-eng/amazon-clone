import java.io.*;
public class Input {
    public static void main(String[] args) throws IOException{
        
    
    FileInputStream fi=new FileInputStream("Mainclass.java");


    FileOutputStream fo=new FileOutputStream("/Users/rajatarora/Desktop/Mainclass.java");

    byte[] b=new byte[fi.available()];
    fi.read(b,0,b.length);
    fo.write(b,0,b.length);

    fo.close();
    fi.close();
    
}
}
