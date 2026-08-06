class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if(product(n) % t == 0) {
                return n;
            }
            n++;
        }
    }
    int product(int n){
        int ans = 1;
        while(n>0){
            int d = n%10;
            ans *= d;
            n /= 10;
        }
        return ans;
    }
}