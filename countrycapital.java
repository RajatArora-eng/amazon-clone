public class countrycapital {
    public static void main(String[] s) {
        String[] country={"India","UK","Srilanka"};
        String[] capital={"New delhi","London","colombo"};
        int i=0;
        for ( i=0; i<country.length;i++)
        {
            if(country[i].equalsIgnoreCase(s[0]))
            {
                System.out.println(capital[i]);
                break;
            }
        }
        if(i>=country.length)
        System.out.println("not in list");
        
    }
}
