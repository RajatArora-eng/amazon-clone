import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("कितने टर्म्स निकालने हैं? ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("कृपया एक सकारात्मक संख्या डालें।");
        } else {
            BigInteger first = BigInteger.ZERO, second = BigInteger.ONE;
            System.out.print("Fibonacci Series: " + first);
            
            if (n > 1) {
                System.out.print(" " + second);
            }
            
            for (int i = 2; i < n; i++) {
                BigInteger next = first.add(second);
                System.out.print(" " + next);
                first = second;
                second = next;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
