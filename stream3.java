/**
 * The `stream3` class in Java reads account information, performs various stream operations on the
 * account data, and outputs the results.
 */
import java.io.IOException;
import java.util.ArrayList;

public class stream3 {
    public static void main(String[] args) throws IOException {     
        ReadEmp em=new ReadEmp();
		ArrayList<Account> list=new ArrayList<Account>();
		
		String str=em.getaccount();
		while(str !=null)
		{
			String[] x=str.split("-");
			Account e=new Account(Integer.parseInt(x[0]),x[1],x[2],Integer.parseInt(x[3]));
			list.add(e);
			str=em.getaccount();
		}
        System.out.println(list);
        list.stream().forEach(Account::statement);
        list.stream().filter(v -> v.balance >= 6000).forEach(Account::statement);
        System.out.println(list.stream().count());			
         System.out.println(list.stream().mapToInt(v->v.balance).average().getAsDouble());
         System.out.println(list.stream().mapToInt(v->v.balance).sum());
         System.out.println(list.stream().mapToInt(v->v.balance).max());
         System.out.println(list.stream().mapToInt(v->v.balance).min());

         System.out.println(list.stream().max((e1,e2)-> e1.balance-e2.balance).get());

     System.out.println(list.stream() .filter(a -> a.actype.equals("saving")).max((a1, a2) -> a1.balance - a2.balance) .get());
     System.out.println(list.stream().filter(a->a.actype.equalsIgnoreCase("current")).max((a1,a2)->a1.balance-a2.balance).get());
   System.out.println( list.stream() .filter(a -> a.actype.equalsIgnoreCase("saving"))  .mapToInt(a -> a.balance) .average());
   System.out.println( list.stream() .filter(a -> a.actype.equalsIgnoreCase("saving"))  .mapToInt(a -> a.balance) .sum());
   System.out.println( list.stream().allMatch(v->v.balance>5000));
   System.out.println(list.stream().anyMatch(v->v.balance>5000));
   list.stream().sorted((e1, e2) ->(e1.balance-e2.balance)).forEach(Account::statement);
   list.stream().sorted((e1,e2)-> e1.accname.compareTo(e2.accname)).forEach(Account::statement); 









        
			
    }

}
