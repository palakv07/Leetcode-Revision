class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] present1 = new boolean[101];
        boolean[] present2 = new boolean[101];

        for (int num : nums1) {
            present1[num] = true;
        }
        for (int num : nums2) {
            present2[num] = true;
        }
        int count1 = 0;
        int count2 = 0;

        for (int num : nums1) {
            if (present2[num]) {
                count1++;
            }
        }
        for (int num : nums2) {
            if (present1[num]) {
                count2++;
            }
        }
        return new int[]{count1, count2};
    }
}