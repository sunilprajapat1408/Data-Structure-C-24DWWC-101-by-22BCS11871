// isse acha hai math formula se n*(n+1)/2

class Cycyle_Missingno {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

     static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j){
                return j;
            }
           
        }
        return nums.length;
    }
}


// Math formula se hai yeh 
// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int expected = n * (n + 1) / 2;
//         int actual = 0;

//         for (int x : nums) {
//             actual += x;
//         }

//         return expected - actual;
//     }
// }
