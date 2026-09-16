class Solution {
    public int commonFactors(int a, int b) {
        int c = 0;
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        int gcd = a;
        for(int i=1;i<=gcd;i++){
            if(gcd%i==0){
                c++;
            }
        }
        return c;
    }
}