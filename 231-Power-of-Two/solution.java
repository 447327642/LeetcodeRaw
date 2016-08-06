/*
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1 || n > (1<<30)) {
            return false;
        }
        int i = 1;
        while(n > i) {
            i *= 2;
        }
        if(n == i) {
        return true;
        }else{
            return false;
        }
    }
}

 */

public class Solution {
    public boolean isPowerOfTwo(int n) {
       return n > 0 && ((n & (n - 1)) == 0 );
    }
}

