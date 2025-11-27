class Myproduct {
    public static void main(String[] s) {
        Product p=new Product();
        p.pcode ="123";
        p.description="pen";
        p.stock=145;
        p.rate=15.75;
        Product p1=new Product();
        p1.pcode="Abc";
        p1.description="eraser";
        p1.rate=20.15;
        p1.stock=250;

        p.sell(5);
        p.sell(10);
        p1.sell(25);
        p.purchase(100);

        p.stock_statement();
        p1.stock_statement();

        
        
    }

    
}

