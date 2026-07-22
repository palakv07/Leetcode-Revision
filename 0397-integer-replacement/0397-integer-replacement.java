class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int c = 0;

        while (num != 1) {
            if ((num & 1) == 0) {
                num /= 2;
            } else {
                if (num == 3 || ((num >> 1) & 1) == 0) {
                    num--;
                } else {
                    num++;
                }
            }
            c++;
        }

        return c;
    }
}