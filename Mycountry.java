import java.util.ArrayList;
import java.util.TreeMap;

public class Mycountry {
	public static void main(String[] args) throws Exception {
		
		states st=new states();		
		TreeMap<String, ArrayList<String>> statess =st.getMap(); 
	
		System.out.println(statess);
		
		

		st.add("mp","guna");
		st.add("mp", "Jabalpur");
		st.add("mp", "Morena");
		st.add("hp", "haridwar");
		
		System.out.println(st.getCities("hp"));
		
		
		
			
	}
}

class states
{

	TreeMap<String, ArrayList<String>> statess = new TreeMap<>();
	ArrayList<String> ar;
	
	states() throws Exception
	{
		ReadEmp rd = new ReadEmp();

		String str = rd.getState();

		while (str != null) {
			String[] x = str.split("-");

			if (statess.containsKey(x[0])) {

				ar = statess.get(x[0]);
				ar.add(x[1]);

			} else {
				ar = new ArrayList<String>();
				ar.add(x[1]);
				statess.put(x[0], ar);
			}

			str = rd.getState();
		}

		
	}


	TreeMap<String, ArrayList<String>> getMap()
	{
		return statess;
	}
	
	void add(String state,String city)
	{
		if (statess.containsKey(state)) {

			ar = statess.get(state);
			ar.add(city);

		} else {
			ar = new ArrayList<String>();
			ar.add(city);
			statess.put(state, ar);
		}
		
	}
	
	ArrayList<String> getCities(String state)
	{
		return statess.get(state);
	}
	
	
	
}