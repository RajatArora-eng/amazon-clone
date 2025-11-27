public class sub4 {
    public static void main(String[] args) {
        String x = "priyadarshini";
        int cnt=0;
        int s=0;
        while (true) {
            s=x.indexOf("n",s);
            if(s== -1) break;
            cnt++;
            s=s+1;
            
        }
       System.out.println("total ocurence="+cnt);
    }
}
