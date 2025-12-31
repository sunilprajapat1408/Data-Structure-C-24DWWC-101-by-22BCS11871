import java.util.*;
public class String_Search {
    public static void main(String[] args) {
        String name = "Sunil";
        char target = 'u';
        // System.out.println(search(name, target));
        // System.out.println(search2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));    // yeh hai bhai toCharArray mai return karne ke liye [S, u, n, i, l]
       
    }
    static boolean search(String str, char target){
            if(str.length() == 0){
                return false;
            }

            for (int index = 0; index < str.length(); index++) {
                if(target == str.charAt(index)){
                    return true;
                }
            }
            return false;
        }


        // 2nd way to return with toCharArray() 
        static boolean search2(String str, char target){
            if(str.length() == 0){
                return false;
            }

            for(char ch : str.toCharArray()){
                if(ch == target){
                    return true;
                }
            }
            return false;
        }
    }

