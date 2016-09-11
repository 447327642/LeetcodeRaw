public class Solution {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Set hs = new HashSet();
        for (char c : cs) {
            if (hs.contains(c)) {
                hs.remove(c);
            } else {
                hs.add(c);
            }
        }
        for (char c : ct) {
            if (hs.contains(c)) {
                hs.remove(c);
            } else {
                hs.add(c);
            }
        }
        char diff = (char) hs.toArray()[0];
        return diff;
    }
}
