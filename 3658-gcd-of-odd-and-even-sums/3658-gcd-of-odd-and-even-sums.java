class Solution {
    int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int even = 0;
        int odd = 0;
        int ec = 0;
        int oc = 0;
        for(int i=1;i<=n*n;i++){
            if(i % 2 == 0){
                ec++;
                if(ec>n){
                    break;
                }
                else{
                    even += i;
                }
            }
            else{
                oc++;
                if(oc>n){
                    break;
                }
                else{
                    odd += i;
                }
            }
        }
        return gcd(even,odd);
        
    }
}