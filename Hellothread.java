public class Hellothread {
public static void main(String[] args) {
    for(int i=1;i<=10; i++)
    {
        System.out.println("hello");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}    
}
}

