import java.util.Scanner;

/* 
Positive and negative
*/

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=sc.nextInt();
        
        if(n == -n && o == -o){
            
            System.out.println(n * o);
        }
        // else if(n == +n && o == +o){
            
        //     System.out.println(n * o);
        // }
        else{
            System.out.println(n + o);
        }
        //write your code here
    }
}
