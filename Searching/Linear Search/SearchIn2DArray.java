import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2,3,4,5},
            {1,7,8},
            {11,12},
            {22,52,36,88}
        };
        int target = 88;
        int[] ans = search(arr, target);
        System.out.println("At Index : "+Arrays.toString(ans));

        int max = maximum(arr);
        System.out.println("Maximum value is : "+max);
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                
                }
            }
        }
    return new int[] {-1,-1};
    }

    // static int maximum(int[][] arr){
    //     int maximum = Integer.MIN_VALUE;
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if(arr[row][col] > maximum){
    //              maximum = arr[row][col];
                
    //             }
    //         }
    //     }
    // return maximum;

    // }

     static int maximum(int[][] arr){
        int maximum = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if(element2 > maximum){
                 maximum = element2;
                
                }
            }
        }
    return maximum;

    }

}
