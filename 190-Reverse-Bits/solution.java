public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //int[] bits = new int[32];
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            //bits[i] = (n % 2)
            reversed += (n % 2) * (1 << (31 - i));
            n = n >>> 1;
        }
        return reversed;
    }
}