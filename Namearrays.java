import java.util.Scanner;

public class Namearrays {
    public static void main(Strings args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Strings names[] = new Strings[size];

        //input
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }
        
        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("names" + (i+1) +" is : " + names[i]);
        }
    }
}
