class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word: str){
            StringBuilder reverse = new StringBuilder(word).reverse();
            ans.append(reverse.append(" "));
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
        
    }
}