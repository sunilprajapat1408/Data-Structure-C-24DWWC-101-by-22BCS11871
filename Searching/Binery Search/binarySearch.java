import java.util.*;
public interface binarySearch {
    public static void main(String[] args) {
        int[] arr = {-89,-55,-2,0,1,2,5,7,15,25,63,69,100,143};
        int target = 26;
        int ans = binary(arr, target);
        System.out.println("Found at index : "+ans);
    }

    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            // int mid = (start + end)/2;
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        } 
        return -1;
        // return start;  // for the smallest number greater than target ceiling method
        // return end;    // for the largest number smaller than target floor of the number method
    }
}

