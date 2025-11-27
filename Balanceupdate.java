public class Balanceupdate {
    void update(int opbal,int wamt)throws Mybalance
    {
        if(opbal<wamt){
            Mybalance my=new Mybalance();
            throw my;

        }
        System.out.println("account balance updated"+ (opbal-wamt));
    }
    
}
