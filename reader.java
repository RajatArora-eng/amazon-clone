import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class reader {
    public static void main(String[] args) throws IOException {
       LinkedList<String> ll=new LinkedList<>();
        BufferedReader br= new BufferedReader(new FileReader("names.txt"));
 String str =br.readLine();
     while (str!= null) {
        ll.add(str);
        str=br.readLine();  
     }

    System.out.println(ll.poll());
       System.out.println(ll);
    // ll.forEach(v-> System.out.println(v));

   //  System.out.println(ll.pop());
   //  System.out.println(ll);



//  System.out.println(ll.offer("****"));
//System.out.println(ll);

//System.out.println(ll.peek());
//System.out.println(ll);


// HashSet<String> hs=new HashSet<>(ll);
// LinkedHashSet<String>lhs=new LinkedHashSet<>(ll);
//System.out.println(lhs);
// TreeSet<String> ts =new TreeSet<>(ll);
//System.out.println(ts);

//<String> ss=ts.tailSet("rajat",false);
//System.out.println(ss);

//System.out.println(ts.ceiling("harsha"));
//System.out.println(ts.floor("harish"));
//System.out.println(ts.higher("harish"));
// System.out.println(ts.lower("harish"));

// System.out.println(ts.subSet("harsh",true, "sudha",false));







 







    }
    
}
