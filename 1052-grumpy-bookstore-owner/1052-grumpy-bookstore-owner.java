class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0;
        int unsat = 0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i] == 0){
                ans += customers[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1){
                unsat += customers[i];
            }
        }
        int max = unsat;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes] == 1){
                unsat -= customers[i - minutes];
            }
            if(grumpy[i] == 1){
                unsat += customers[i];
            }
            max = Math.max(max,unsat);
        }
        return ans + max;
    }
}