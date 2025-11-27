import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

     if(age>=18){
        System.out.println("eligible a vote ");
     }
     else{
    System.out.println("dont eligible a vote ");
     }
        

    }
    
}
