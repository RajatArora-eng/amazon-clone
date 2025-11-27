class Bank {
    public static void main(String[] s) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the acc no");
        int accno=sc.nextInt();
        
        sc.nextLine();
        System.out.println("enter the acc name");
        String accname=sc.nextLine();
        System.out.println("enter the acc type");
        String acctype=sc.nextLine();
        System.out.println("balance");
        int balance=sc.nextInt();
        sc.nextLine();
        Account acc=new Account(accno, accname, acctype, balance);
        System.out.println("enter the amount to deposit");
        int amt=sc.nextInt();
        acc.deposit(amt );
        System.out.println("enter the amount to withdeawl");
        amt=sc.nextInt();
        acc.withdrawl(amt);
        acc.statement();
        
    }
}
