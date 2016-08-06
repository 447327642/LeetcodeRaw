public class Solution {
    public int[] plusOne(int[] digits) {
    digits[digits.length - 1] += 1;
    for (int i = digits.length - 1; i >= 1; i--) {
        if (digits[i] == 10) {
            digits[i] = 0;
            digits[i-1] += 1;
        }
    }
    if (digits[0] == 10) {
        int[] d = new int[digits.length + 1];
        d[0] = 1;
        return d;
    }
    return digits;
    }
}

