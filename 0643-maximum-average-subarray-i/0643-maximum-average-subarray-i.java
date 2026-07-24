class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n == 1 && k == 1){
            return (double)nums[0];
        }
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];            
        }
        int max = sum;
        for(int i =k;i<n;i++){
            sum += nums[i];
            sum -= nums[i-k];
            max = Math.max(max,sum);
        }
        return (double)max/k;        
    }
}