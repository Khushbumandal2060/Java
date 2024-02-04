import java.util.*;
public class CharAtString {
    public static void main(String[] args) {
        String firstName = "Golu";
        String lastName = "Mandal";
        String fullName = firstName + lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++) {
             System.out.println(fullName.charAt(i));
        }
    }
}
