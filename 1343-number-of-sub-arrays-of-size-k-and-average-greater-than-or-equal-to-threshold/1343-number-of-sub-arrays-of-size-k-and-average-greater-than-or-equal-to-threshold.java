class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int r = 0;
        int sum = arr[r];
        int avg = 0;
        int c = 0;
        while(r < arr.length){
            if(r-l+1 < k){
                r++;
                sum += arr[r];
            }
            else if(r-l+1 == k){
                avg = sum/k;
                if(avg >= threshold){
                    c++;
                }
                if(r == arr.length - 1){
                    break;
                }
                r++;
                sum += arr[r] - arr[l];
                l++;
            }
        }
        return c;
        
    }
}