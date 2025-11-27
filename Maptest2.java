import java.util.*;
public class Maptest2 {
    public static void main(String[] args) {
        HashMap<String,Emp> eMap=new HashMap<>();
        Emp emp;
        try{
            ReadEmp re =new ReadEmp();
            String x=re.getdata();
            while (x!=null) {
                String[]y=x.split("-");
                for (int i = 0; i < y.length; i++) {
                        y[i] = y[i].trim();
                }
                emp=new Emp(Integer.parseInt(y[0]), y[1], y[2], Integer.parseInt(y[3]));
                eMap.put(y[0],emp);
                x=re.getdata();
            }
        }
          catch (Exception e) {
            e.printStackTrace();
          }
        //   if( eMap.containsKey("20"))
        //   {

        // System.out.println("found");
        //   }
        //   else
          
        //     System.out.println("not found");
             Emp mp = new Emp(1, "*****", "******",7) ;
             
             System.out.println(eMap.getOrDefault("104",mp));
             System.out.println(eMap.get("1"));
            emp=eMap.compute("1",(k,v)->  new Emp(v.id,v.name,v.city,v.salary+20000));
            System.out.println(emp);

            
        }
            

    
    }