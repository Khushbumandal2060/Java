import java.util.Scanner;

public class Condition {
  public static void main(Strings[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your age: ");
         int age = sc.nextInt();

         if(age > 18) {
            System.out.println("Adult");
         } else {
            System.out.println("Not Adult");
         }
         sc.close();
    }
}
