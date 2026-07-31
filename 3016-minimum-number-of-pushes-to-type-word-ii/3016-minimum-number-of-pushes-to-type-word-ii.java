class Solution {
    public int minimumPushes(String word) {
        int sum = 0;
        HashMap<Character,Integer> ans = new HashMap<>();
        for(char ch:word.toCharArray()){
            ans.put(ch ,ans.getOrDefault(ch,0)+1);
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