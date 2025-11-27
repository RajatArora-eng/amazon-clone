 class Infosys extends Employ
 {
    String gender,post,mobile;
    Infosys(   int eno,String ename,String city,int salary,String gender,String mob,String post)
    {
        super(eno,ename,city,salary);
        this.gender=gender;
        this.post = post;
        this.mobile=mob;
    }
    void showsalary() {
        double da = 0, ta = 0, hra = 0, gross = 0;
        da = salary * 1.20;

        if (city .equals ("delhi") || city .equals("mumbai")||city .equals (" chennai") )
        {
            ta = salary * 0.90;
       
        } else {
            ta = salary * 0.70;
        }
      
       
        if (post .equals("menager") ) 
        {
            hra = salary * 0.75;
         }
         else
         hra = salary * 0.60;
        gross = ta + hra + da + salary;
        System.out.println("Employee da is        : " + da);
        System.out.println("Employee ta is        : " + ta);
        System.out.println("Employee hra is       : " + hra);
        System.out.println("Employee Gross is     : " + gross);
        
     }
     void showprofile()
     {
       super.showprofile();
       System.out.println("Employee Gender         : " + gender);
       System.out.println("Employee mobile number  : " + mobile);
       System.out.println("Employee post           : " + post);
      
     }
}