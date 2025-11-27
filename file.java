import java.io.*;
public class file {
    public static void main(String[] args) throws IOException {
       File file=new File("arora.txt");
        file.createNewFile();
        System.out.println(file.exists());
        FileWriter fw=new FileWriter(file);
        fw.write("java is best languge");
        fw.close();
       FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
       
       String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
       fr.close();
       br.close();


    }
    
}
