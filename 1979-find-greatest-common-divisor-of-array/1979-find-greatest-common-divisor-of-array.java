class Solution {
    int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int n = nums.length - 1;
        int max = nums[0];
        int min = nums[0];
        for(int i=0;i<=n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return gcd(max,min);      
    }
}