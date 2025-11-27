public  class Myshape {
    public static void main(String[] s) 
    {
        shape sh;
        Rectangle rt =new Rectangle (5,9);
        Circle cr =new Circle(5);
        sh=rt;
        sh.area ();
        sh.show();

        sh=cr;
        sh.area();
        cr.show(2);

    }
    
}
