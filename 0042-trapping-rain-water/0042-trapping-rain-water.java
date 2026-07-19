class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int sum = 0;
        int imax = 0;
        int jmax = 0;
        while(i<=j){
            if(height[i]<height[j]){
                if(height[i]>= imax){
                    imax = height[i];
                }
                sum += imax - height[i];
                i++;
            }
            else{
                if(height[j]>=jmax){
                    jmax = height[j];
                }
                sum += jmax - height[j];
                j--;
            }
        }
        return sum;
    }
}