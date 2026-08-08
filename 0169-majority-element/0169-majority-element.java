import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> result = new HashMap<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        
        int l = result.getOrDefault(nums[i],0);
        l++;
        result.put(nums[i],l);
        if(l > n/2){
            return nums[i];
        }
       }
       return 0;
    }
}