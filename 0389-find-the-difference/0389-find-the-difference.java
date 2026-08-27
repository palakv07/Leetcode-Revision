class Solution {
    public char findTheDifference(String s, String t) {
        int sums = 0;
        int sumt = 0;
        for(int i=0;i<t.length();i++){
            sumt += t.charAt(i);
            if(i<s.length()){
                sums += s.charAt(i);
            }
        }
        char ch = (char)(sumt - sums);
        return ch;
        
    }
}