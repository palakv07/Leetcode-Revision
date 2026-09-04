class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();

        int degree = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] a = map.get(nums[i]);
                a[0]++;
                a[2] = i;
            }

            int[] a = map.get(nums[i]);

            if (a[0] > degree) {
                degree = a[0];
                ans = a[2] - a[1] + 1;
            } else if (a[0] == degree) {
                ans = Math.min(ans, a[2] - a[1] + 1);
            }
        }

        return ans;
    }
}