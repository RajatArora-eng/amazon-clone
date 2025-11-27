public class Staticmain {
    public static void main(String[] args) {
        Mystatic.b=20;
        Mystatic.show();
      //  Mystatic.a=10;
        Mystatic m1=new Mystatic();
        Mystatic m2=new Mystatic();
        m1.a=25;
        m1.b=5;
        m2.a=80;
        m2.b=60;

        m1.display();
        m2.display();
    }
    
}
