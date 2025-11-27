import java.lang.reflect.Array;
import java.util.Arrays;

public class analgram {
    public static void main(String[] args) {
        String nitin="nishar";
        String r="sharin";

      char[] nitinArr = nitin.toCharArray();
      char[] rArr = r.toCharArray();
       Arrays.sort(nitinArr);
       Arrays.sort(rArr);

     if (Arrays.equals(nitinArr, rArr) && nitin.length() == r.length()) {
        System.out.println("it is anagram");
        
     } 
     else{
        System.out.println("it is not anagram");
     }
    }
    
}
