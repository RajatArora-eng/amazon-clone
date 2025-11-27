 class Account {
    private int accno;
    int balance;
    String accname;
    String actype;

    Account(int accno, String accname, String actype,int bal)
    {
        this.accno=accno;
        this .accname=accname;
        this.actype=actype;
        this.balance=bal;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accno;
        result = prime * result + balance;
        result = prime * result + ((accname == null) ? 0 : accname.hashCode());
        result = prime * result + ((actype == null) ? 0 : actype.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accno != other.accno)
            return false;
        if (balance != other.balance)
            return false;
        if (accname == null) {
            if (other.accname != null)
                return false;
        } else if (!accname.equals(other.accname))
            return false;
        if (actype == null) {
            if (other.actype != null)
                return false;
        } else if (!actype.equals(other.actype))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Account [accno=" + accno + ", balance=" + balance + ", accname=" + accname + ", actype=" + actype + "]";
    }

    void deposit(int amt)
    {
        balance +=amt;
        System.out.println("balance updated"+balance);
    }
    void withdrawl(int amt)
    {
        if(balance>=amt)
        {
            balance -=amt;
            System.out.println("balance updated "+balance);
        }
        else
        System.out.println("insufficient balance");

    }

    void statement()
    {
        System.out.println("account statement");
        System.out.println("Actype"+actype);
        System.out.println("name"+accname);
        System.out.println("balance"+balance);

        // Mywords m=new Mywords();
        // String w=m.towords(balance+"");
        // System.out.println("in words Rs "+w);
    }
    
}
