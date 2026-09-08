class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        int l = 0;
        int r = 0;
        HashSet<Integer> s = new HashSet<>();
        while(r < nums.length){
            while(s.contains(nums[r])){
                s.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            s.add(nums[r]);
            sum += nums[r];
            
            if(r-l+1 == k){
                max = Math.max(max,sum);
                s.remove(nums[l]);
                sum -= nums[l];
                l++;                  
            }
            r++;            
        }
        return max;        
    }
}