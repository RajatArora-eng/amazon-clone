 class IcIcI extends RbiAccount 
 {
    String gender,email,mobile;
    IcIcI(int accno,String accname,String gen,String addr,String email,String dob,String acctype,int bal,String mobile )
    {
        super(accno,accname,acctype,bal);
        this.gender=gen;
        this.mobile=mobile;
        this.email=email;
        

    }

    void withdrawl(int amt )
    {
        if (getBalance()-amt >=-10000)
        {
            setBalance(getBalance()-amt);
            System.out.println("amount updated  ");
        }
        else 
        System.out.println("not enough balance  ");
    }
    void deposit( int amt)
    {
        double intrest=0;
        if (getBalance()<0)
        
            
            {
                intrest=getBalance()*.02;
                intrest *=-1;
            }

            setBalance(getBalance() + amt-(int)intrest);

        

    }

    void statement()
    {
        super.statement();
        System.out.println(gender+" ,"+ email+" ,"+ mobile);
    }
    

}

 
