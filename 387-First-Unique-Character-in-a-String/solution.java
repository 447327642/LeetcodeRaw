public class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> hs = new HashMap<Character, Integer>();
        for (int i = 0; i < c.length; i++) {
            if (!hs.containsKey(c[i])) {
                hs.put(c[i],i);
            } else {
                hs.replace(c[i],-1);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (hs.containsValue(i)) {
                return i;
            }
        }
        return -1;
    }
}


