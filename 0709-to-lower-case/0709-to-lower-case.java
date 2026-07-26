class Solution {
    public String toLowerCase(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            str += Character.toLowerCase(ch);
        }
        return str;
        
    }
}