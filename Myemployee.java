class Myemployee {
    public static void main(String[] s) {

        Employ e=new Employ();
        e.showprofile();
        e.showsalary();
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the eno");
        int eno=sc.nextInt();
               sc.nextLine();
        System.out.println("enter the ename");
        String ename=sc.nextLine();
        System.out.println("enter the city");
        String city=sc.nextLine();
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        sc.nextLine();

       Employ e1=new Employ(eno,ename,city,salary);
       e1.showprofile();
       e1.showsalary(); 
    }
    
}
