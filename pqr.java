 class pqr {
    private int p ,q;
    private pqr( int a,int b)
    {
        p=a;
        q=b;

    }
    void show()
    {
        System.out.println("a+b");
    }
    static pqr getPqr(int a,int b)
    {
        pqr pq = new pqr(a,b);
        return(pq);
    }  
    
    
}


