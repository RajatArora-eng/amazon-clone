class Sbi extends RbiAccount 
{
    String gender ,addr,email,dob;
    Sbi(int accno,String accname,String gen,String addr,String email,String dob,String acctype,int bal )
    {
        super(accno,accname,acctype,bal);
        this.gender=gen;
        this.addr=addr;
        this.email=email;
        this.dob=dob;

        if (bal<5000)
        System.exit(0);


    }

    void withdrawl(int amt)
    {
        if (getBalance()-amt>=5000)
                {
                    setBalance(getBalance()-amt);
                    System.out.println("account updated   ");
                }
                else 
                System.out.println("not enough balance  ");
            }
        
        
        
            void statement()
    {
        super.statement();
        System.out.println(gender+" ,"+addr +" ,"+email+","+dob);
    }

}
