public class Product {
    String pcode ,description;
    double rate;
    int stock;
    void sell( int qty)
    {
        if (stock > qty)
        {
            stock -=qty;
            System.out.println("Item sold");
        }
        else 
        System.out.println("note in stock");
    }
    void purchase(int qty)
    {
        stock +=qty;
        System.out.println("item purchased");
    }
    void stock_statement()
    {
        System.out.println("pcode :"+pcode);
        System.out.println("Description"+ description);
        System.out.println("Rate"+rate +"\t stock:"+ stock);
        System.out.println("Amount :"+(rate*stock));

        Mywords m=new Mywords();
        int x=(int)(rate*stock);
        String w = m.towords(x+"");
        System.out.println(w);
    }
    
}

