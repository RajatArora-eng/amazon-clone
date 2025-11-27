class overload {
int display()
    {
        System.out.println("1 2 3");
        return 1;
    }
    void display(int x)
    {
        System.out.println("476");
    }
    void display(int x,int y){
        System.out.println("768");
    }
    //void display( double x){
       // System.out.println("abcd");
    }
    

class overloadmain{
    public static void main(String[] s) {

        overload o=new overload();
        o.display( (int) 20,25);
        o.display();;
        o.display(2);
        o.display(2,3);
       // o.display(8,3,4);
        
    }
}
