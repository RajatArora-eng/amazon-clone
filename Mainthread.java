public class Mainthread {
    public static void main(String[] args) {
        childthread c=new childthread();
        for( int i=1; i<=5; i++){
       
        System.out.println("main thread");
        
       try
        {
            c.join();
        }
        catch(Exception ex)
       {
   System.out.println(ex.getMessage());
       }
    }
    c.show();
        
        
        

        System.out.println("done");
    }
    
}
