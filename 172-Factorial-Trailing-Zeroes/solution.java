public class Solution {
    public int trailingZeroes(int n) {
        int a = 0;
        int x = 5;
        while (x <= n && x <= Integer.MAX_VALUE / 5) { // if (x <= Integer.MAX_VALUE), x may overflow and hence enter another loop
            a += n / x;
            x *= 5;
        }
        if (x > Integer.MAX_VALUE / 5) { // last step, does not operate x *= 5 and enter the condition check
            a += n / x;
        } // 
        return a;
    }
}