class Mybank {
    public static void main(String[] args) {
        Account[]ac=new Account[10];
        int  acno=1001;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        for(int i=0; i<ac.length;i++)
        {
            System.out.println("enter the account name");
            String acname=sc.nextLine();
            System.out.println("enter the account type");
            String actype=sc.nextLine();
            System.out.println(" balance");
            int bal=sc.nextInt();
           sc.nextLine();
            ac[i]=new Account(acno, acname, actype, bal);
            acno++;


        }

        while(true)
        {
            int ch=0;
            System.out.println("1.Deposite");
            System.out.println("2.withdraw");
            System.out.println("3.show Balance");
            System.out.println("4.show all");
            System.out.println("5.exit");

            System.out.println("enter choice");
            ch=sc.nextInt();
            if(ch==5) break;

            if(ch==4)
            {
                for(Account x: ac)
                {
                    x.statement();
                }
            }
            if (ch==3)
            {
                System.out.println("enter the accno");
                int acnox=sc.nextInt();
                ac[acnox-1001].statement();
            }
            if (ch==2|| ch==1)
            {
                System.out.println("enter accno");
                int acnox=sc.nextInt();
                System.out.println("enter  the ammount");
                int amt=sc.nextInt();
                if (ch==2)
                ac[acnox-1001].withdrawl(amt);
                else 
                if(ch==1)
                ac[acnox-1001].deposit(amt);
            }
        }
        
    }

    
}
