class Solution {
    int binarySearch(int[] nums,int target ,boolean findfirst){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(findfirst){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last = binarySearch(nums, target, false);{
            return new int[]{first,last};
        }        
    }
}