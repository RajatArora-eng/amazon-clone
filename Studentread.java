import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Studentread {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new FileReader("student.txt"));
        String str =br.readLine();
        student std;
        ArrayList<student> ss=new ArrayList<>();
        LinkedHashSet<student> sd=new LinkedHashSet<>(ss);
       
        while ( str!= null) {
            String[] x=str.split("-");
          //  for (int i = 0; i < x.length; i++) {
            //    x[i] = x[i].trim();
           // }
        std=new student(Integer.parseInt(x[0]),x[1],x[2], Double.parseDouble(x[3]),x[4],x[5]);
            sd.add(std);
            str=br.readLine();
        }
      sd.forEach(v->System.out.println(v));
     
         //  ss.removeIf(v->(v.rollNo>105));
        //    LinkedHashSet<student> sd=new LinkedHashSet<>(ss);
//Collections.sort(ss, (s1, s2) -> Integer.compare(s1.rollNo, s2.rollNo));
// student topper = Collections.max(ss);
// System.out.println("Topper Student: " + topper);
// student min=Collections.min(ss);
// System.out.println( " min student "+min);
//ss.forEach(v->System.out.println(v));




        }
    }

    
    

