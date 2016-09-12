public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,ArrayList<Integer>> ht1 = new HashMap<Integer,ArrayList<Integer>>();
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!ht1.containsKey(nums1[i])) {
                ArrayList<Integer> a = new ArrayList<Integer>();
                a.add(i);
                ht1.put(nums1[i],a);
            } else {
                ArrayList<Integer> a = ht1.get(nums1[i]);
                a.add(i);
                ht1.put(nums1[i],a);
            }
        }
        for (int i : nums2) {
            if (ht1.containsKey(i)) {
                array.add(i);
                ArrayList<Integer> a = ht1.get(i);
                a.remove(0);
                if (a.size() == 0) {
                    ht1.remove(i);
                } else {
                    ht1.put(i,a);
                }
            }
        }
        int[] result = new int[array.size()];
        Object[] o = array.toArray();
        for (int i = 0; i < array.size(); i++) {
            result[i] = (int) o[i];
        }
        return result;
    }
}

