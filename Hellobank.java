class Hellobank 
{
    public static void main(String[] s) 
    {
        RbiAccount rbi;
        Sbi sbi=new Sbi(101,  "rajat arora","   gender :  male"
        ,"address :123 street","  email :  rajat@123","  dob  : 14 october","saving",15000 );
        System.out.println();
        
        
        IcIcI icc=new IcIcI(203, " rajat", " gender  male", 
        " addr :udgeeif", "  email: rajat@1233", "  dob :14 oct", "saving", 15000 ,"  mobileno :9384775");
    

        Bob  bob =new Bob(2442, "rajat", " gender male", 
        " addr : hanuman nagar", " email : rajat@11", "  dob  :14 oct", "zero balance", 16000);
        
       
       
        rbi=sbi;
        System.out.println("Sbi bank");
        rbi.withdrawl(15000);
        rbi.statement();

        System.out.println();
        System.out.println();


        rbi=icc;
        System.out.println("IcIcI bank");
        rbi.withdrawl(26000);
        rbi.deposit(10000);
        rbi.statement();
        System.out.println();
        System.out.println();

        rbi=bob;
        System.out.println("Bob bank");
        rbi.withdrawl(600);
        rbi.deposit(29990);
        rbi.statement();
        System.out.println();
        System.out.println();
    }
}
