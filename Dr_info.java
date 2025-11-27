

import java.util.*;


public class Dr_info {

	
	public static void main(String[] args) throws Exception {
		
			
		TreeMap<String, ArrayList<doctor>> doctors=new TreeMap<String, ArrayList<doctor>>() ;
		ArrayList<doctor> doc; 
		 
	ReadEmp dr=new ReadEmp();
		
		String str=dr.getdr();
	
		while(str != null)
		{
			String[] y= str.split("-");
			
;
		doctor temp=new doctor(Integer.parseInt(y[0]), y[1], y[2],y[3] ,Integer.parseInt(y[4]));

			if(doctors.containsKey(y[2]))
			{
				doc=doctors.get(y[2]);
				doc.add(temp);
			}
			else
			{
				doc=new ArrayList<doctor>();
				doc.add(temp);
				doctors.put(y[2], doc);
				
			}

			
			str=dr.getdr();

		}
		
		
	doctors.forEach((v, k) -> System.out.println(v + ": " + k));
	
		System.out.println(doctors.get("oncologist"));
		
	}

}
