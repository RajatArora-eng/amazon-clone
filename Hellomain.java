public class Hellomain 

    
 {
    public static void main(String[] args) throws Exception {
        Helloworld hw=new Helloworld();
        HellloThread t1=new HellloThread(hw);
        HellloThread t2=new HellloThread(hw);

        t1.join();
        t2.join();

        Helloworld tw=new Helloworld();
        HellloThread t3=new HellloThread(tw);
        HellloThread t4=new HellloThread(tw);

        t3.join();
        t4.join();
        
    }
    
}
