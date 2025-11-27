  public class fequency {
    public static void main(String[] args) {
        String s="sohankumar";
        int totalcount= s.length();//total length
       int totalcount_afterremoving= s.replace("h","").length();
        int count=totalcount-totalcount_afterremoving;
        System.out.println("number of occur  "+count);

    }
    
}
