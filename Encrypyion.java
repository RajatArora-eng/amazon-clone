import java.util.*;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
public class Encrypyion {

    public static void main(String[] args) {
        String n="how are you";
        byte[] b=n.getBytes();
         Encoder en=Base64.getEncoder();
         String x=en.encodeToString(b);

         System.out.println(x);

         Decoder de=Base64.getDecoder();
         b=de.decode(x);
         String str=new String(b);
         System.out.println(str);
    }
    
}
