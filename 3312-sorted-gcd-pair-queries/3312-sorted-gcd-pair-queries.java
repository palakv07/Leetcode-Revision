class Solution {
    public int[] gcdValues(int[] nums, long[] queries){
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] freq = new int[max+1];
        for(int x:nums){
            freq[x]++;
        }
        int[] divisible = new int[max + 1];
        for(int d=1;d<=max;d++){
            for(int multiple = d;multiple <= max;multiple += d){
                divisible[d] += freq[multiple];
            }
        }
        long[] gcdCount = new long[max+1];
        for(int g = max;g>=1;g--){
            long cnt = divisible[g];
            gcdCount[g] = cnt*(cnt - 1)/2;
        }
        for(int g = max;g>=1;g--){
            for(int multiple = 2*g;multiple <= max;multiple += g){
                gcdCount[g] -= gcdCount[multiple];
            }
        }
        long[] prefix = new long[max+1];
        for(int i = 1;i<=max;i++){
            prefix[i] = prefix[i-1] + gcdCount[i];
        }

        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            long target = queries[i] + 1;
            int low = 1;
            int high = max;
            while(low<high){
                int mid = low + (high - low)/2;
                if(prefix[mid] >= target){
                    high = mid;
                }
                else{
                    low = mid + 1;
                }
            }
            ans[i] = low;
        }
        return ans;      

    }
}