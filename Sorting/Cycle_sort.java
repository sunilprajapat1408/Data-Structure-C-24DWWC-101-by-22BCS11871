public class Cycle_sort {
    public static void main(String[] args) {
        int[] arr = {1,7,8,6,4,3,5,2};
        cycle(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void cycle(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}
