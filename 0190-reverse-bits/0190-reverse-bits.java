class Solution {
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
        // Shift result left to make room for the new bit
            reverse = (reverse << 1);
        // Add the current LSB of n to the result
            reverse = (reverse | (n & 1));
        // Shift n right to process the next bit
            n >>>= 1; // Use unsigned shift for 32-bit reversal
        }
        return reverse;
    }
}
