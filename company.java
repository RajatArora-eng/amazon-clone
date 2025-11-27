public class company 
{
    public static void main(String[] args)
    {
        Tcs tc=new Tcs(86, " rajat", "gwalior", 677700, "rajat@ysy  ", 
        "male", "8455049797", "72fufejg");

        Infosys inf=new Infosys(637373, "rahul", "delhi", 
        78848484, "male", "7373388338", "manager");

    
    System.out.println("tcs");
    tc.showsalary();
    tc.showprofile();
    System.out.println();
    System.out.println();


    
    System.out.println("infocys");
    inf.showprofile();
    inf.showprofile();
    System.out.println();
    System.out.println();
}
}