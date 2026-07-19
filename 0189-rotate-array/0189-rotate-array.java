class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);        
    }
    void swap(int[] nums,int s,int e){
        int temp;
        while(s<e){
            temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}