import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int x:ans.keySet()){
            if(ans.get(x) > n/3){
                result.add(x);
            }
        }
        return result;
        
    }
}