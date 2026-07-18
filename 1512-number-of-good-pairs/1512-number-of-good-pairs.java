import java.util.HashMap;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int c = 0;
        for(int i:nums){
            if(ans.containsKey(i)){
                c += ans.get(i);
            }
            ans.put(i, ans.getOrDefault(i, 0) + 1);
        }
        return c;
        
        
        
    }
}