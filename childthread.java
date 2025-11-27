public class childthread extends Thread {
    
    childthread()
    {
        start();
    }
    public void run()
    {
        show();
    }
    void show(){
    
        for(int i=1; i<=5;i++){
        
        System.out.println("this is a child");
        try{
            Thread.sleep(6000);
        }
        catch(Exception ex)
        {
System.out.println(ex.getMessage());
        }
        }
    }
    
}
