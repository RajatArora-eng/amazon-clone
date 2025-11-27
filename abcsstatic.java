public class abcsstatic {
    int a ;
    static int b;

    static{
        b=0;
        System.out.println(1);
    }
    void show(){
        System.out.println(a+b);
    }

}


class Mystaticc {
    public static void main(String[] args) {
        abcsstatic.b=10;
        System.out.println(2);
        abcsstatic.b=50;
        System.out.println(3);
    }
 static{
    System.out.println(5);
 }
    
}
