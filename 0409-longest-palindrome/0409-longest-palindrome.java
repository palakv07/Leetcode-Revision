class Solution {
    public int longestPalindrome(String s) {
        int c = 0;
        if(s.length() == 1){
            return 1;
        }
        HashMap<Character,Integer> ans = new HashMap<>();
        for(int i=0;i<s.length();i++){
            ans.put(s.charAt(i),ans.getOrDefault(s.charAt(i),0)+1);
        }
        boolean odd = false;
        for(int i:ans.values()){
            if(i%2 == 0){
                c += i;
            }
            else{
               c += i-1;
               odd = true; 
            }
        }
        if(odd){
            c++;
        }
        return c;
        
    }
}