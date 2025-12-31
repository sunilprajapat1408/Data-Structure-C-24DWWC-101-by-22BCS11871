import java.util.*;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // Input 
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        // for(int row=0; row < arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //        System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        // shortcut 
        // for(int row=0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        // inhence for loop shortcut of shortcut
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
