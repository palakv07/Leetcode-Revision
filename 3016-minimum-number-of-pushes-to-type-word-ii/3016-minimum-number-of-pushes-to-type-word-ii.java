class Solution {
    public int minimumPushes(String word) {
        int sum = 0;
        HashMap<Character,Integer> ans = new HashMap<>();
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            int l = ans.getOrDefault(ch,0);
            l++;
            ans.put(ch,l);
        }
        List<Integer> list = new ArrayList<>(ans.values());

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        for(int j=0;j<list.size();j++){
            sum += (j/8 + 1)*list.get(j);
        }
        return sum;
        
    }
}