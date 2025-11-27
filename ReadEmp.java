import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IO;
import java.io.IOException;

public class ReadEmp implements AutoCloseable {
    BufferedReader br, br2, br3 ,br4,br5,br6,br7,br8;

    public ReadEmp() throws IOException {
        br = new BufferedReader(new FileReader("student.txt"));  // Reading from student.txt
        br2=new BufferedReader(new FileReader("Emp.txt"));
        br3=new BufferedReader(new FileReader("state.txt"));
        br4=new BufferedReader( new FileReader("doctor.txt"));
        br5=new BufferedReader(new FileReader("book.txt"));
        br6=new BufferedReader(new FileReader("names.txt"));
        br7=new BufferedReader(new FileReader("account.txt"));
        br8=new BufferedReader(new FileReader("zomato.txt"));
    }
  

    public String getstudent() throws IOException {
        return br.readLine();  // Read one line at a time
    }
    public String getdata() throws IOException{
        return br2.readLine();
    }
public String getState() throws IOException
{

    return br3.readLine();
}
public String getdr() throws IOException{
    return br4.readLine();
}
public String getbook() throws IOException{
    return br5.readLine();
}
public String getnamek() throws IOException{
    return br6.readLine();
}
public String getaccount() throws IOException{
    return br7.readLine();
}
public String getZomato() throws IOException{
    return br8.readLine();
}
    @Override
    public void close() throws IOException {
        if (br != null) {
            br.close();  // Close the BufferedReader
        }
    }
   
}
