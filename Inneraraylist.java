import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inneraraylist {
    public static void main(String[] args) {
        

        ArrayList<String> lst = new ArrayList<>();
        

       lst.add("rakesh");
        lst.add("rakesh");
        lst.add("rrade");
        lst.add("raju");
        lst.add("rahul");
        lst.add("ramesh");
        lst.add("hshh");
        lst.add("hshh");
        lst.add("hshh");
       





//lst.forEach(v-> System.out.println(v.toUpperCase()));

lst.forEach(v-> System.out.println(v.indexOf("a")));
lst.forEach(v-> System.out.println(v.contains("a")));
//lst.forEach(System.out:: println);


//Iterator<String> itr=lst.iterator();
//while(itr.hasNext())
{
   // System.out.println(itr.next());
}


/*System.out.println(lst);
lst.remove(2);
System.out.println(lst);
lst.remove("raju");
System.out.println(lst);*/



       // System.out.println(lst.get(2));





        //System.out.println(lst.isEmpty());
       // System.out.println(lst.size());

      // lst.removeIf(v->v.length()>=5);
       //System.out.println(lst);


/*lst.removeIf(v->v.startsWith("a"));
System.out.println(lst);*/

ArrayList<String> name = new ArrayList<>();
        

        name.add("aditya");
        name.add("rakesh");
        name.add("faran");
        name.add("meena");
        name.add("rakesh");
        name.add("rrade");
        name.add("hshh");

        lst.addAll(name);

       /*  System.out.println(lst.contains("varun"));

        System.out.println(lst.containsAll(name));
        lst.removeAll(lst);
       System.out.println(lst);*/

       //lst.retainAll(name);
      // System.out.println(lst);


      List<String> l= lst.subList(4, 10);
System.out.println(l);


lst.sort(null);
System.out.println(lst);

l=lst.reversed();
System.out.println(l);



    }

    
}
