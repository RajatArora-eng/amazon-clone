public class sub3 {
    

    public static void main(String[] args) {
        
         String p="priyadarshini";
        
         for (int i = p.length() ; i >= 0; i--) {
             String ch = p.substring(0,i);
             System.out.println(ch);
         }

    }
}