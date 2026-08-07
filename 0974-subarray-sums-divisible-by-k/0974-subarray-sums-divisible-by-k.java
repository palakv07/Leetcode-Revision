class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int c = 0;
        int prefix = 0;
        for(int i :nums){
            prefix += i;
            int rem = ((prefix % k) + k) % k;
            if(map.containsKey(rem)){
                c += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
    }
}