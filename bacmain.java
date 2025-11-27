

public class bacmain {
	public static void main(String[] args) {
		abc ab1 = new abc(1,2);
		abc ab2 = new abc(1,2);
		xy x=new xy();
		x.a = 1;
		x.b =2;
		
		//System.out.println(ab1==ab2);
		System.out.println(ab1.equals(ab2));
		System.out.println(ab1);
		System.out.println(ab2);

	}

}