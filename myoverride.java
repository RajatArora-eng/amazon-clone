

public class myoverride 
{
    public static void main(String[] s) 
    {
        base b=new base();
        overridesub o=new overridesub();
        xz x=new xz();
        b.display();
        b=o;
        b.display();
        b.display();
        o.display();
        o.display();

        b=x;
        b.display();
        x.display(10);

    }
}
