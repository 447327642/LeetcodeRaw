public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.equals("")) {
            return 0;
        } else {
            int count = 0;
            boolean start = false;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    if (start) {
                        return count;
                    }
                } else {
                    start = true;
                }
                count = start ? count + 1 : count;
            }
            return count;
        }
    }
}




