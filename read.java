import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;


public class read {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new FileReader("Emp.txt"));
        String str =br.readLine();
        Emp emp;
        ArrayList<Emp>emplist=new ArrayList<>();
        while(str!=null)

        {
            String[] x=str.split("-");
            for (int i = 0; i < x.length; i++) {
                x[i] = x[i].trim();
            }
            emp=new Emp(Integer.parseInt(x[0]),x[1],x[2],Integer.parseInt(x[3]));
            emplist.add(emp);
            str=br.readLine();
        }

       // emplist.add(0,new Emp(2000, "newemp", "newcity", 9999));
    
   
  emplist.removeIf(v->v.salary<=50000 );
//System.out.println(emplist);
    //emplist.removeIf(v->v.name.contains("a"));
    //System.out.println(emplist);
    // emplist.removeIf(v->v.city.equals("raipur"));
    // System.out.println(emplist);
    // emplist.add(new Emp(99, "rajesh", "guna", 999002));
    // System.out.println(emplist);
emplist.trimToSize();

LinkedHashSet<Emp> hr=new LinkedHashSet<>(emplist);
hr.forEach(v->System.out.println(v));
Comparator<Emp> comp=(e1,e2)->e1.id-e2.id;
emplist.sort(comp);

    
 }


  



  
    
        
    }
   

