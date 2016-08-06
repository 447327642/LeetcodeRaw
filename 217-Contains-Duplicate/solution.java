import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet hash = new HashSet();
    for (int i: nums) {
        hash.add(i);
    }
    return hash.size() != nums.length;
    }
}