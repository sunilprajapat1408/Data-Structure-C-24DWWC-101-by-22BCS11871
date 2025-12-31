import java.util.*;

public class abc {
    public static void main(String[] args) {
        int[] arr = {7,4,1,2,5,8,9,6,3};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
}
