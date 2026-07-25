class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int rs = 0;
        int rl = matrix.length-1;
        int cs = 0;
        int cl = matrix[0].length-1;
        while(rs<=rl && cs<=cl){
            for(int i=cs;i<=cl;i++){
                arr.add(matrix[rs][i]);
            }
            rs++;
            for(int i=rs;i<=rl;i++){
                arr.add(matrix[i][cl]);
            }
            cl--;
            if(rs<=rl){
                for(int i =cl;i>=cs;i--){
                    arr.add(matrix[rl][i]);
                }
                rl--;
            }
            if(cs<=cl){
                for(int i = rl; i >= rs; i--){
                    arr.add(matrix[i][cs]);
                }
                cs++;
            }                              
                    
        }
        return arr; 
    }
}