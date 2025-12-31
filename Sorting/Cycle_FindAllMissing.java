import java.util.List;
import java.util.ArrayList;

public class Cycle_FindAllMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,7,4,9,2,6,1};
        System.out.println(FindAllMissing(arr));
    }

    public static List <Integer> FindAllMissing(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(correct >= 0 && correct < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;
    }
}
