public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1,-7,8,-12,6,7,9};
        int target = -12;

        System.out.println(linear(arr, target, 1, 4));
    }

    static int linear(int[] arr, int target, int start, int end){
            if(arr.length==0){
                return -1;
            }

            for(int index=0; index<arr.length;index++){
                int element = arr[index];
                if(element == target){
                    return index;
                  
                }
            }

            // for(int index=start; index<end;index++){      //  dono approaches are correct
            //     int element = arr[index];
            //     if(element == target){
            //         return index;
                  
            //     }
            // }

            return -1;
        }
}
