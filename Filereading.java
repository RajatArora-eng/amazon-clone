
import java.io.*;


public class Filereading {

	public static void main(String[] args) {
		try
		{
			FileInputStream fi =  new FileInputStream("D:\\javacode\\Bank.java");
		
	
		System.out.println(fi.available());
		int x = fi.read();
		FileOutputStream fo = new FileOutputStream("d:\\myfile.java");
		while(x != -1) 
		{
			fo.write(x);
		  //System.out.println(x);

		//System.out.println(Integer.toBinaryString(x));
		//System.out.print(Integer.toHexString(x));
		//System.out.print(Integer.toOctalString(x));
			
		x = fi.read();
		 
		}
		 fo.close();
		 fi.close();
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
