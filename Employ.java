 abstract class Employ {
    int eno,salary;
    String ename,city;

    Employ()
    {
        eno=101;
        ename="amit";
        city="pune";
        salary=20000;

    }

    Employ(int eno,String ename,String city,int salary)
    {
        this.eno=eno;
        this.ename=ename;
        this.city=city;
        this.salary=salary;
    }
    void showprofile()
    {
        System.out.println("Eno"+eno);
        System.out.println("Ename"+ename);
        System.out.println("city"+city);
        System.out.println("salary"+salary);
    }
   abstract void showsalary();
   
        
    }
