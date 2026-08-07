class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        for(int i=0;i<nums.length;i++){
            arr[i+1] = nums[i] + arr[i];
        }
        for(int i=0;i<n;i++){
            int left = arr[i];
            int right = arr[n] - arr[i+1];
            if(left == right){
                return i;
            }
        }
        return -1;       
    }
}