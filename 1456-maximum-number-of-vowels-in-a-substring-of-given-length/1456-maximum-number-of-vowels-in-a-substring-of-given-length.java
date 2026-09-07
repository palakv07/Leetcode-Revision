class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        int n = s.length();
        for(int i=0;i<k;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'e'){
                c++;
            }            
        }
        int maxv = c;
        for(int i=0;i<n - k;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'e'){
                c--;
            }
            if(s.charAt(i+k) == 'a' || s.charAt(i+k) == 'u' || s.charAt(i+k) == 'i' || s.charAt(i+k) == 'o' || s.charAt(i+k) == 'e'){
                c++;
            }
            maxv = Math.max(maxv,c);
        }
        return maxv;        
    }
}