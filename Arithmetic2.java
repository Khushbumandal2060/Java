import java.util.*;

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       // System.out.println("Enter two number: ");
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulo: "+(a%b));
    }
}