public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set s1 = new HashSet();
        Set s2 = new HashSet();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            if (s1.contains(i)) {
                s2.add(i);
            }
        }
        Object[] o = s2.toArray();
        int [] ret = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            ret[i] = (int) o[i];
        }
        return ret;
    }
}

