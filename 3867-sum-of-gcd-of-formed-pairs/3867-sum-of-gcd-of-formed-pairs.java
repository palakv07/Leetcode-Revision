import java.util.Arrays;
class Solution {
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            prefixGcd[i] = gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        int s = 0;
        int e = nums.length - 1;
        long sum = 0;
        while(s<e){
            sum += gcd(prefixGcd[s],prefixGcd[e]);
            s++;
            e--;
        }
        return sum;        
    }
}