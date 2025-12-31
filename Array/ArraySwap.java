import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,6};
        swap(arr, 0,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index0 , int index2){
        int temp = arr[index0];
        arr[index0] = arr[index2];
        arr[index2] =  temp;

    }   

}
