class Myquis {
    public static void main(String[] s) {
        {
            java.util.Scanner sc=new java.util.Scanner(System.in);
            Quis q = new Quis("where is taj located ?","agra","delhi","gwalior","bhopal","agra");
            q.showQuestion();
            String reply =sc.nextLine();
            Quis q2=new Quis("where is gwalior located", "up", "mp", "bihar", "arunachal", "mp");
            q2.showQuestion();
            String ster =sc.nextLine();
            
            boolean t=q.checkAns(reply);
            
            if(t)
            System.out.println("weldone you are correct!!");
            else
            System.out.println("sorry wrong answer");
            boolean f=q2.checkAns(ster);
            if(f)
            System.out.println("weldone you are correct!!");
            else
            System.out.println("sorry wrong answer");
        }
    }
    
}
