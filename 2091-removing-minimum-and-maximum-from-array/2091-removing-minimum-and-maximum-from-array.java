class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi = 0;
        int mini = 0;
        if(nums.length == 1){
            return 1;
        }
        for(int i= 0;i<nums.length;i++){
            if(nums[maxi] >= nums[i]){
                maxi = i;
            }
            if(nums[mini] <= nums[i]){
                mini = i;
            }
        }
        if (mini > maxi) {
            int temp = mini;
            mini = maxi;
            maxi = temp;
        }
        int max = maxi + 1;
        int min = nums.length - mini;
        int both = (mini + 1) + (nums.length - maxi);
        return Math.min(min,Math.min(max,both));
    }
}