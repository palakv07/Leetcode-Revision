class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int x = 0;
        int y = 0;
        int num = 0;
        String dtr = "up";
        while(x<m && y<n){
            if(dtr.equals("up")){
                while(x>=0 && x<m && y>=0 && y<n){
                    ans[num++] = mat[x][y];
                    x--;
                    y++;
                }
                if(x < 0 && y < n){
                    x = x + 1;
                } 
                else {            
                    y = y - 1;
                    x = x + 2;
                }
                dtr = "bottom";
            }
            else{
                while(x>=0 && x<m && y>=0 && y<n){
                    ans[num++] = mat[x][y];
                    x++;
                    y--;
                }
                if(y<0 && x<m){
                    y +=1;
                }
                else{
                    x -=1;
                    y +=2;
                }
                dtr = "up";
            }
        }
        return ans;
    }
}