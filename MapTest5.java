import java.io.IOException;
import java.util.*;
public class MapTest5 {
    
    public static void main(String[] args) throws IOException {

        HashMap<String, ArrayList<book>> b = new HashMap<>();
        ArrayList<book> bo;
		 
	ReadEmp bd=new ReadEmp();
    Bookmanager bok = new Bookmanager();
		
		String str=bd.getbook();
        while(str != null)
		{
			String[] y= str.split("-");
        

		book temp=new book(y[0], y[1], y[2],y[3] ,Integer.parseInt(y[4]),y[5],y[6],y[7]);
        if(b.containsKey(y[2]))
        {
            bo=b.get(y[2]);
            bo.add(temp);
        }
        else
        {
        bo = new ArrayList<book>();
            bo.add(temp);
            b.put(y[2], bo);
        }
         bok.addBook(temp);
        str=bd.getbook();
    }


   ArrayList<book> booksByTitle = bok.ByTitle("thecatcherintherye");
   ArrayList<book> booksByPublisher = bok.ByPublisher("bloomsbury");
    ArrayList<book> booksByAddition = bok.ByAddition("2nd");
   ArrayList<book> booksByMedium = bok.ByMedium("english");
   ArrayList<book> booksbycategory=bok.Bycategory("fiction");



   booksByTitle.forEach(v->System.out.println("Books by title"+v));
    booksByPublisher.forEach(v -> System.out.println("Books by Publisher: " + v));
    booksByAddition.forEach(v -> System.out.println("Books by Addition: " + v));
    booksByMedium.forEach(v -> System.out.println("Books by Medium: " + v));
    booksbycategory.forEach(v -> System.out.println("Books by Category: " + v));

}
}
