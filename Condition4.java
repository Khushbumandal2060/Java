import java.util.Scanner;
public class Condition4 {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1) {
            System.out.println("Hello"); 
        } else if (button == 2) {
            System.out.println("Namaste");
        }else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
            sc.close();
        }
    }
}
