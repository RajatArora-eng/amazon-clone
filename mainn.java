import java.time.*;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class mainn {
    public static void main(String[] args) {
        LocalDate l = LocalDate.now();
        System.out.println( l.toString());
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(l.format(df));

        LocalTime now= LocalTime.now();
        System.out.println(now);

        LocalTime cusLocalTime=LocalTime.of(22, 22, 0);
        System.out.println(cusLocalTime);
        
        LocalDate ld=LocalDate.of(2004, 10, 14);
        System.out.println(ld);
        Month sd=ld.getMonth();
        System.out.println(sd);
        DayOfWeek ss=ld.getDayOfWeek();
        System.out.println(ss);
        LocalDate sf=l.minusDays(10);
        System.out.println(sf.format(df));
       
        
    }
}
