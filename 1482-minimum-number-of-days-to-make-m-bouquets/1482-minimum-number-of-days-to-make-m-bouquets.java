class Solution {
    public int adjacentFlower(int[] bloomDay, int l, int k){
        int c = 0;
        int bouq = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= l){
                c++;
                if(c == k){
                    bouq++;
                    c=0;
                }
            }
            else{
                c = 0;
            }
        }
        return bouq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int answer = -1;
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int s = bloomDay[0];
        int e = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            s = Math.min(s,bloomDay[i]);
            e = Math.max(e,bloomDay[i]);
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(m <= adjacentFlower(bloomDay,mid,k)){
                answer = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return answer;
    }
}

        
        