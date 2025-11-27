 class Xyzz extends Abcc
 {
    int c;
    Xyzz()
    {
     super(0);   
        c=0;
    }

    Xyzz(int x)
    {
        super(x);
        
        c=x;
    }
    Xyzz(int x,int y,int z )
    {
        super( x,y);
        c=z;
    }
    Xyzz(Xyzz xy)
    {
        super(xy);
        c=xy.c;
    }
    void show()
    {
        System.out.println( getab()+ " "+c);
                            
    }


    
}
