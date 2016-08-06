public class Solution {
    public boolean isPowerOfFour(int num) {
        return (num > 0 && ((num & 1431655765) != 0) && ((num & (num-1)) == 0)); // (num & 1431655765) != 0 ensure the i is on odd bit; num & (num-1) to determine whether num begins with 1 and follows with all 0;
    }
}