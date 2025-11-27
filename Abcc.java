 class Abcc 
 {
    private int  a,b;
    Abcc()
    {
        a=b=0;
    }

    Abcc (int a)
    { 
         this.a=b=a; 
   
    }

    Abcc( int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    Abcc(Abcc ab)
    {
        a=ab.a;
        b=ab.b;
    }


    int  getab ()
    {
        return ( a+b);
        
    
    } 
    
 }
