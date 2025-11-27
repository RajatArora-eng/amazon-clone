import java.util.ArrayList;

public class Stream2 {
    public static void main(String[] args) throws Exception{
        ReadEmp em=new ReadEmp();
		ArrayList<student> std=new ArrayList<student>();
		
		String str=em.getstudent();
		while(str !=null)
		{
			String[] y=str.split("-");

            student e = new student(Integer.parseInt(y[0]), y[1], y[2], Double.parseDouble(y[3]), y[4].trim(), y[5]);
			std.add(e);
			str=em.getstudent();
		}
   //	System.out.println(emplist);
			//emplist.stream().forEach(Emp::showprofile);
			System.out.println( std.stream().allMatch(v->v.name.equals("gwalior")));
			System.out.println( emplist.stream().anyMatch(v->v.city.equals("gwalior")));
			System.out.println( emplist.stream().noneMatch(v->v.city.equals("gwalior")));
			
        
    }
    
}
