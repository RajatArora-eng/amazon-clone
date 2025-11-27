

public class abc {
	int a,b;
	abc(){
		
	}
	abc(int a, int b){
		this.a= a;
		this.b = b;
	}
	void  Show(){
		System.out.println(a+","+b);
		
	}

	 public String toString() {
		
		return("["+a+ "-"+b+"]");
	}
	 public int hashCode()
	 {
		 return 1;
	 }
	 public boolean equals(Object o)
	 {
		 if(o== this || o instanceof abc)
		 {
			 abc ab = (abc)o;
			 if(ab.a ==a && ab.b==b)
			 {
				 return true;
			 }
			 else
				 return false;
		 }
		 else 
		 {
			 return false;
		 }
		
		 
	 }

}