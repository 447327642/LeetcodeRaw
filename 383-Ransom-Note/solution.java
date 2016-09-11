public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        for (char c : m) {
            if (!hm.containsKey(c)) {
                hm.put(c,1);
            } else {
                int count = hm.get(c);
                hm.replace(c,count,count + 1);
            }
        }
        for (char c : r) {
            if (!hm.containsKey(c)) {
                return false;
            } else {
                int count = hm.get(c);
                if (count > 0) {
                    hm.replace(c,count,count - 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
