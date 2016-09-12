/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int beg = 1;
        int end = n;
        while (beg < end) {
            boolean oracle = isBadVersion(beg + (end - beg) / 2);
            if (oracle) {
                end = beg + (end - beg) / 2;
            } else {
                beg = beg + (end - beg) / 2 + 1;
            }
        }
        return beg;
    }
}
