import java.util.*;
public class Function4 {
    
    public static void printFactorial(int n) {
        int factorial = 1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
