import java.util.Arrays;
class Solution {
    public int minPairSum(int[] nums){
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length - 1;
        int max = nums[0];
        while(s<=e){
            if(nums[s] + nums[e] > max){
                max = nums[s] + nums[e];
            }
            else{
                s++;
                e--;
            }
        }
        return max;
    }
}