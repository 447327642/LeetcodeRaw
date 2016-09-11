public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int max = 1;
        int major = nums[0];
        for (int i : nums) {
            if (!hm.containsKey(i)) {
                hm.put(i,1);
            } else {
                int count = hm.get(i);
                hm.replace(i,count,count + 1);
                if (count + 1 > max) {
                    max = count + 1;
                    major = i;
                }
            }
        }
        return major;
    }
}
