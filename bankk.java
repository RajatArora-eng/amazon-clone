public class bankk extends Thread {
    int bal=5000;
    int withdraw;

    bankk(int withdraw)
    {
        this.withdraw=withdraw;
    }
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name+"withdraw money");
            bal=bal-withdraw;
        }
        else
        {
            System.out.println("insufficicient balance");
        }
    }
    
}
