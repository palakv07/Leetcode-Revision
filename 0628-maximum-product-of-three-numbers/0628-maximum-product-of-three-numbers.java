import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int p = 1;
        int n = 1;
        for(int i=0;i<l;i++){
            p = nums[l-1]*nums[l-2]*nums[l-3];
            n = nums[0]*nums[1]*nums[l-1];            
        }
        return Math.max(p,n);        
    }
}