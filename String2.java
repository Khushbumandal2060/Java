import java.util.*;
public class String2 {
     public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

       if(name1.compareTo(name2) == 0) {
         System.out.println("String are equal");
        } else {
          System.out.println("Strings are not equal");
       }
       
       //DO NOT USE == to check for string equality
       //gives correct answer here
       if(name1 == name2) {
         System.out.println("String are equal");
      } else {
        System.out.println("Strings are not equal");
      }

     //gives incorrect answer here
     if(new String("Tony") == new String("Tony")) {
          System.out.println("strings are equal");
     } else {
          System.out.println("Strings are NOT equal");
     }
   }    
}
