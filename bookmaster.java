public class bookmaster {
    
int isbn;
int copies;
String title;
String publisher;


public  bookmaster(  int isbn,int copies,String title,String publisher){

    this.isbn=isbn;
    this.copies=copies;
    this.title=title;
    this.publisher=publisher;
}

public void show(){
    System.out.println(isbn);
    System.out.println(copies);
    System.out.println(title);
    System.out.println( publisher);
}
public static void main(String[] args) {
    bookmaster s=new bookmaster(6, 8, "hero", "ram chandra");
    s.show();
}


}

