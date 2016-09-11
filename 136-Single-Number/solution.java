public class Solution {
    public int singleNumber(int[] nums) {
        Set s = new HashSet();
        for (int i : nums) {
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }
        return (int) s.toArray()[0];
    }
}