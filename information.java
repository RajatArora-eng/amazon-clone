class information
{
    public static void main(String[] s)
     {
        String name=s[0];
        String gender=s[1];
        String city =s[2];
         int salary =Integer.parseInt(s[3]);

         double da =salary* 1.20;
         double hra =salary*0.25;
         double ta =salary*0.4;
         double spall=salary*0.2;

         double gra = da+hra+ta+spall;

         System.out.println(" da"+ da);
         System.out.println(" hra"+ hra);
         System.out.println(" ta"+ ta);
         System.out.println(" spall"+ spall);
         System.out.println(" gra"+  gra);
    }
}