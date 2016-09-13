public class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }
        int ret = 0;
        Queue<Integer> c= new LinkedList<Integer>();
        for (int i = 0; x > 0; i++) {
            c.offer(x - x / 10 * 10);
            x /= 10;
        }
        while (c.size() > 0) {
            int temp = c.poll();
            if (temp >= 3 && c.size() >= 9) return 0; // prevent overflow
            ret += power(10,c.size()) * temp;
            if (ret < 0) return 0; // prevent overflow
        }
        return ret * sign;
    }
    
    public int power(int base, int e) {
        int ret = 1;
        for (int i = 0; i < e; i++) {
            ret *= base;
        }
        return ret;
    }
}


