public class Solution {
    public int trailingZeroes(int n) {
        int a = 0;
        int x = 5;
        while (x <= n && x <= Integer.MAX_VALUE / 5) {
            a += n / x;
            x *= 5;
        }
        if (x > Integer.MAX_VALUE / 5) {
            a += n / x;
        }
        return a;
    }
}