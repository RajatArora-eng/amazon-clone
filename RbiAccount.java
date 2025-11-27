abstract class RbiAccount {
    private int accno, balance;
    private String accname, actype;

    RbiAccount(int accno, String accname, String actype,int bal)
    {
        this.accno=accno;
        this .accname=accname;
        this.actype=actype;
        this.balance=bal;

    }

    void deposit(int amt)
    {
        balance +=amt;
        System.out.println("balance updated  "+balance);
    }
   abstract void withdrawl(int amt);
    

    void statement()
    {
        System.out.println("account statement  ");
        System.out.println("Actype  "+actype);
        System.out.println("name   "+accname);
        System.out.println("balance   "+balance);

       
    }
    void setBalance(int bal)
    {
        balance=bal;
    }
    int getBalance()
    {
        return(balance);
    }
    
}


