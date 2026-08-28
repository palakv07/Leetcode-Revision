class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && !ans.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int arr[] = new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = ans.get(i);
        }
        return arr;
        
    }
}