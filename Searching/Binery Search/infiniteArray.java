public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println("Found at index : "+ans(arr, target));
    }
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart =end+1;
            // double the box value
            // end = previous end + sizeofbox *2
            end = end + (end - start + 1 )*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
     static int binarySearch(int[] arr, int target, int start, int end){

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
    }
}
