public class Mybankk {
    public static void main(String[] args) {
        Balanceupdate bu=new Balanceupdate();
        try
        {
            bu.update(25000, 4500);
        }
        catch(Mybalance m){
            m.errorMsg();
        }
        try
        {
            bu.update(13500, 5000);
        }
        catch(Mybalance m){
            m.errorMsg();
        }
        try
        {
            bu.update(2000, 20000);

        }
        catch(Mybalance m){
            m.errorMsg();
        }
        try
        {
            bu.update(25000, 400);
        }
        catch(Mybalance m){
            m.errorMsg();
        }
        System.out.println("account balance updated");
    };
    }
    

