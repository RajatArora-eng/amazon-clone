import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class book {
    public String isbn;
    public String title;
    public String author;
    public String publisher;
    public int  price;
    public String addition;
    public String medium;
    public String category;


 public book( String isbn,String title,String author,String publisher,int price,String addition,String medium,String category){
    this.isbn = isbn;
    this.title= title;
    this.author=author;
    this.publisher=publisher;
    this.price=price;
    this.addition=addition;
    this.medium=medium;
    this.category=category;
 }


 @Override
public String toString() {
    return "book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", price="
            + price + ", addition=" + addition + ", medium=" + medium + ", category=" + category + "]";
}


 @Override
 public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
    result = prime * result + price;
    result = prime * result + ((addition == null) ? 0 : addition.hashCode());
    result = prime * result + ((medium == null) ? 0 : medium.hashCode());
    result = prime * result + ((category == null) ? 0 : category.hashCode());
    return result;
 }


 @Override
 public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    book other = (book) obj;
    if (isbn == null) {
        if (other.isbn != null)
            return false;
    } else if (!isbn.equals(other.isbn))
        return false;
    if (title == null) {
        if (other.title != null)
            return false;
    } else if (!title.equals(other.title))
        return false;
    if (author == null) {
        if (other.author != null)
            return false;
    } else if (!author.equals(other.author))
        return false;
    if (publisher == null) {
        if (other.publisher != null)
            return false;
    } else if (!publisher.equals(other.publisher))
        return false;
    if (price != other.price)
        return false;
    if (addition == null) {
        if (other.addition != null)
            return false;
    } else if (!addition.equals(other.addition))
        return false;
    if (medium == null) {
        if (other.medium != null)
            return false;
    } else if (!medium.equals(other.medium))
        return false;
    if (category == null) {
        if (other.category != null)
            return false;
    } else if (!category.equals(other.category))
        return false;
    return true;


 }
}
class Bookmanager {

    TreeMap<String, ArrayList<book>> booksByTitle = new TreeMap<>();
    TreeMap<String, ArrayList<book>> booksByPublisher = new TreeMap<>();
    TreeMap<String, ArrayList<book>> booksByAddition = new TreeMap<>();
    TreeMap<String, ArrayList<book>> booksByMedium = new TreeMap<>();
    TreeMap<String, ArrayList<book>> booksBycategory = new TreeMap<>();



     void addToMap(TreeMap<String, ArrayList<book>> map, String key, book b) {
        if (map.containsKey(key)) {
            map.get(key).add(b);
         } else {
            ArrayList<book> list = new ArrayList<>();
            list.add(b);
            map.put(key, list);
        }
     }
    void addBook(book b) {
        addToMap(booksByTitle, b.title, b);
        addToMap(booksByPublisher, b.publisher, b);
        addToMap(booksByAddition, b.addition, b);
        addToMap(booksByMedium, b.medium, b);
        addToMap(booksBycategory, b.category, b);

    }

    ArrayList<book> ByTitle(String title) {
        return booksByTitle.get(title);
    }

    ArrayList<book> ByPublisher(String publisher) {
        return booksByPublisher.get(publisher);
    }

    ArrayList<book> ByAddition(String addition) {
        return booksByAddition.get(addition);
    }

    ArrayList<book> ByMedium(String medium) {
        return booksByMedium.get(medium);
    }
    ArrayList<book> Bycategory( String category){
        return booksBycategory.get(category);
    }
}

   
