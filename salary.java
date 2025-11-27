public class salary {
    public static void main(String[] s) 
    {
      String ename=s[0];
      String city=s[1];
      int salary=Integer.parseInt(s[2]);

      double da= salary *1.20;
      double ta = salary *0.40;
      double hra= salary *0.25;

      double gr =salary + da +ta+ hra;

      System.out.println("ename"+ename );
      System.out.println("city"+city );
      System.out.println("salary"+salary );
      System.out.println("da"+da );
      System.out.println("ta"+ta );
      System.out.println("hra"+hra );
      System.out.println("gr"+gr);
    }
    
}
