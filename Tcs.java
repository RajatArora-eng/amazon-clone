 class Tcs extends Employ {

    String gender,email,mobile , dob;
    Tcs(int eno,String ename,String city,int salary,String email,String gender,String mob,String dob)
    {
        super(eno,ename,city,salary);
        this.gender=gender;
        this.mobile=mob;
        this.email=email;
        this.dob=dob;
    }
    void showsalary() {
        double da = 0, ta = 0, hra = 0, sp_all = 0, gross = 0;
        da = salary * 1.70;
    
        if (city. equals ("delhi") || city .equals ("mumbai") ) {
          ta = salary * 0.80;
        } else if (city.equals("kolkata") || city.equals( "chennai") ) {
          ta = salary * 0.70;
        } else {
          ta = salary * 0.50;
        }
        hra = salary * 0.50;
        if (gender.equals("female") ) {
          sp_all = salary * 0.1;
    
        }
        gross = ta + hra + da + salary + sp_all;
        System.out.println("Employee da is        : " + da);
        System.out.println("Employee ta is        : " + ta);
        System.out.println("Employee hra is       : " + hra);
        System.out.println("Employee sp_all is    : " + sp_all);
        
        System.out.println("Employee Gross salary : " + gross );
      }
      void showprofile()
      {
        super.showprofile();
        System.out.println("Employee Gender         : " + gender);
        System.out.println("Employee mobile number  : " + mobile);
        System.out.println("Employee Date of Birth  : " + dob);
        System.out.println("Employee Email          : " + email);
      }
    }

