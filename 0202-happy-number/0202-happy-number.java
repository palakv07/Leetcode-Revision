class Solution {
    public boolean isHappy(int n){
        while(n != 1 && n != 4){
            int sq = 0;
            while(n>0){
                int d = n % 10;
                sq += d*d;
                n /= 10;
            }
            n = sq;
        }
        return n == 1;
    }
}