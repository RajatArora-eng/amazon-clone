public class HellloThread extends Thread {
    Helloworld hw;
    HellloThread(Helloworld hw)
    {
        this.hw=hw;
        start();
    }
    public void run()
    {
        hw.show();
    }
}
