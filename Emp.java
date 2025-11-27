

public class Emp implements Comparable<Emp>
{
    int id;
    String name;
    String city;
    int salary;

    public Emp(int id, String name, String city, int salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String toString() {
        return "Emp{" +
               "id=" + id +
              ", name='" + name + 
               ", city='" + city + 
               ", salary=" + salary +
               "}";

   }

    @Override
    public int hashCode()
    {
        return id+name.charAt(0);

    }

    @Override
    public boolean equals(Object o)
    {
        if(o==this|| o instanceof Emp)
        {
            Emp e=(Emp)o;
            if(e.id==this.id  && 
           e.name.equals(this.name)  &&
           e.city.equals(this.city) &&
           e.salary==this.salary);
           return true;
        }
     
       else return false;
       
    }
    public int compareTo(Emp o){
      // return this.id-o.id;
        return this.salary-o.salary;
 }
 void showprofile()
 {
     System.out.println("id"+id);
     System.out.println("name"+name);
     System.out.println("city"+city);
     System.out.println("salary"+salary);
 }

     



 

   
    }

 
  
    

       

