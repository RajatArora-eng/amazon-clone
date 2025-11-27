import java.util.ArrayList;
import java.util.TreeMap;

public class MyZomato {
    public static void main(String[] args) throws Exception{

        TreeMap<String,ArrayList<zomato>> zam=new TreeMap<>();
        ReadEmp r=new ReadEmp();
        String str=r.getZomato();
        while (str!=null) {
            String[] x=str.split(",");
      zomato temp= new zomato(Integer.parseInt(x[0]), Double.parseDouble(x[1]),  Integer.parseInt(x[2]), x[3], x[4], x[5], x[6],x[7]);
      System.out.println(temp);

      str=r.getZomato();

      

        }
        
    }
}
