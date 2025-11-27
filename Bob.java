 class Bob extends RbiAccount
  {
    String gender ,addr,email,dob;
    Bob(int accno,String accname,String gen,String addr,String email,String dob,String acctype,int bal )
    {
        super(accno,accname,acctype,bal);
        this.gender=gen;
        this.addr=addr;
        this.email=email;
        this.dob=dob;
  }

  void withdrawl(int amt) {
   if (getBalance() - amt>=0) {
    
     setBalance(getBalance() - amt);
   }
      setBalance(getBalance()-amt);
      System.out.println("account updated");
    }
  

  
  

  void statement() {
    super.statement();
    System.out.println(gender+" ,"+addr +" ,"+email+","+dob);
  }

}
