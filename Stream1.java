

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String [] s1) throws Exception {

//		ArrayList<String> namelst = new ArrayList<String>();
//		BufferedReader br = new BufferedReader(new FileReader("d:\\javacode\\name.txt"));
//		String str = br.readLine();
//		while(str != null) {
//			namelst.add(str);
//			str = br.readLine();			
//			}
//		System.out.println(namelst);
//		
//		Stream<String> s= namelst.stream();
//		
		//List<String> lst= s.limit(5).toList();     
		//System.out.println(lst);
		
//		System.out.println(s.allMatch(v->v.contains("a")));
//		System.out.println(namelst.stream().anyMatch(v->v.contains("a")));
//		System.out.println(namelst.stream().noneMatch(v->v.contains("a")));
//		
		
//		List<String> lst=s.skip(5).toList();
//		System.out.println(lst);


//		List<String> lst=s.sorted().toList();
//		System.out.println(lst);
		
//		System.out.println(s.max((a,b)->a.length()-b.length()).get());
//		System.out.println(namelst.stream().min((a,b)->a.length()-b.length()).get());
		
//		List<Integer> lst=namelst.stream().map(v->v.length()).toList();	
//		System.out.println(lst);
//		
//		System.out.println(namelst.stream().map(v->v.length()).distinct().reduce((sum,v)-> sum+v).get());
		
		//List<Character> lst=namelst.stream().map(v->v.charAt(0)).toList();
		
	//	List<Character> lst=namelst.stream().map(v->v.charAt(0)).collect(Collectors.toList());
	//	System.out.println(lst);
		

		ReadEmp emp=new ReadEmp();
		ArrayList<Emp> emplist=new ArrayList<Emp>();
		
		String str=emp.getdata();
		while(str !=null)
		{
			String[] x=str.split("-");
			for (int i = 0; i < x.length; i++) {
				x[i] = x[i].trim();
			}
			Emp e=new Emp(Integer.parseInt(x[0]),x[1],x[2],Integer.parseInt(x[3]));
			emplist.add(e);
			str=emp.getdata();
		}
			
		//	System.out.println(emplist);
			//emplist.stream().forEach(Emp::showprofile);
			System.out.println( emplist.stream().allMatch(v->v.city.equals("gwalior")));
			System.out.println( emplist.stream().anyMatch(v->v.city.equals("gwalior")));
			System.out.println( emplist.stream().noneMatch(v->v.city.equals("gwalior")));
			
			
			emplist.stream().filter(v->v.salary>=6000).forEach(Emp::showprofile);
			System.out.println(emplist.stream().count());			
		 	System.out.println(emplist.stream().mapToInt(v->v.salary).average().getAsDouble());
		 	System.out.println(emplist.stream().mapToInt(v->v.salary).sum());
		 	System.out.println(emplist.stream().mapToInt(v->v.salary).max());
		 	System.out.println(emplist.stream().mapToInt(v->v.salary).min());
			
		 	//System.out.println(emplist.stream().max((e1,e2)-> e1.salary-e2.salary).get());
			
			//System.out.println(emplist.stream().max((e1,e2)-> e1.ename.length()-e2.ename.length()).get());
			
		//	emplist.stream().sorted((e1,e2)-> e1.name.compareTo(e2.name)).forEach(Emp::showprofile);
			

		
			
			
			
	}
	}