public class Helloworld {
   synchronized void show()
    {
        System.out.println("hello");
        try{
            Thread.sleep(1000);
        }
        catch(Exception ex)
        {
            System.out.println("error");
        }
        
        System.out.println("how");
        try{ Thread.sleep(1000);}
        catch(Exception ex)
        {
          System.out.println("error");
        }
        System.out.println("are you");

    }
}
    

