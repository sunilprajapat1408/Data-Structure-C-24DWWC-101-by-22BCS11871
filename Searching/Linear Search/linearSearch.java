import java.util.*;

// Simple code
// public class linearSearch{
//     public static void main(String[] args) {
//         int[] arr = {7,4,1,2,5,8,9,6,3};
//         int target = 9;

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == target){
//                 System.out.println(i);
//             }
//         }
//     }
// }

public class linearSearch {

    public static void main(String[] args) {
        int[] arr= {5,3,6,7,1,2,8};
        int target = 8; 
        int ans = linear(arr, target);
        System.out.println("At index "+ans);
    }

        static int linear(int[] arr, int target){
            if(arr.length==0){
                return -1;
            }

            for(int index=0; index<arr.length;index++){
                int element = arr[index];
                if(element == target){
                    return index;
                  
                }
            }

            // yeh element return karne ke liye hai samjha 
            // for(int num : arr){
            //     if(num == target){
            //         return num;
            //     }
            // }
            return -1;
        }
       
    }
