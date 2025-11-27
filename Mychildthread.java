public class Mychildthread extends Thread {
    Mychildthread(String x){
        super(x);
        start();

    }
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("child");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception ex){

            }
        }
    }
    
}
