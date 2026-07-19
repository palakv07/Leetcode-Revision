class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
        
    }
}