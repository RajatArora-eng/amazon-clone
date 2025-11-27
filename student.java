

public class student implements Comparable<student> {
  public  int rollNo;
   public String name;
   public String studentClass;
  public  double percentage;
  public  String email;
     public String address;

    public student(int rollNo, String name, String studentClass, double percentage, String email, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.studentClass = studentClass;
        this.percentage = percentage;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
               "rollNo=" + rollNo +
               ", name='" + name + '\'' +
               ", class='" + studentClass + '\'' +
               ", percentage=" + percentage +
               ", email='" + email + '\'' +
               ", address='" + address + '\'' +
               '}';
    }

    // @Override
    // public int hashCode() {
    //     return rollNo + name.charAt(0);
    // }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o instanceof student) {
    //         student s = (student) o;
    //         return s.rollNo == this.rollNo &&
    //                s.name.equals(this.name) &&
    //                s.studentClass.equals(this.studentClass) &&
    //                s.percentage == this.percentage &&
    //                s.email.equals(this.email) &&
    //                s.address.equals(this.address);
      //  }
      //  return false;
 //   }

    @Override
    public int compareTo(student o) {
        return (int) (this.percentage- o.percentage);
    }
}

   