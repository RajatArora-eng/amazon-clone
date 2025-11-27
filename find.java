import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class find {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int raw=sc.nextInt();
        System.out.println("Enter columns");
        int colum=sc.nextInt();
        int numbers[][]= new int[raw][colum];

        for(int i=0; i<raw;i++){
            for(int j=0;j<colum;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the value of x");
        int x=sc.nextInt();
 for(int i=0; i<raw;i++){
            for(int j=0;j<colum;j++){
              if(numbers[i][j]==x){
                System.out.println("x found on location ("+i+","+j+")");
              }

            }
            
        }


//         System.out.println("Enter the value of X");
//         int x = sc.nextInt();

//         for(int j=0;j<numbers.length;j++){
//             if(numbers[j] == x){
//                 System.err.println("X is found in "+ j+" index");
      
//     }

//     Arrays.sort(numbers);
//     System.out.println(Arrays.toString(numbers));
// }
    }
}


