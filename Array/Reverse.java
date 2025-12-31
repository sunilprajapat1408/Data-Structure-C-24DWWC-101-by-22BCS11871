import java.util.*;
public class Reverse{
    public static void main(String[] args) {

        // // Brute force
        // String str = "Hello";
        // String reversed = "";

        // for (int i = str.length() - 1; i >=0 ; i--) {

        //     reversed = reversed + str.charAt(i);
        // }

        // System.out.println(str);
        // System.out.println(reversed);


        // optimized
        String str1 = "Sunil Prajapat";

        StringBuilder sb = new StringBuilder(str1);
        String reversed = sb.reverse().toString();

        System.out.println(str1);
        System.out.println(reversed);
        
    }
}