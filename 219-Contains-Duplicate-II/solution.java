import java.util.Hashtable;

public class Solution {
   	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
   	for (int i = 0; i < nums.length; i++) {
   	    if (ht.containsKey(nums[i])) {
   	        int pre = ht.get(nums[i]);
   	        if (i - pre <= k) {
   	            return true;
   	        }
   	    }
   	    ht.put(nums[i], i);
   	}
   	return false;
   	}
}

/*  Time Limit Exceeded 
public class Solution {
   	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		if (k <= 0) {
			return false;
		}
		if (k >= nums.length) {
			for (int i = 0; i < nums.length; i++) {
				ht.put(nums[i], nums[i]);
			}
			if (ht.size() < nums.length) {
				return true;
			} else {
				return false;
			}
		}
		for (int i = 0; i < k; i++) {
			ht.put(nums[i], nums[i]);
			System.out.println("size:"+ht.size());;
		}
		for (int i = 0; i < nums.length - k; i++) {
		    ht.put(nums[i + k], nums[i + k]);
			if (ht.size() < k + 1) {
				System.out.println("size2:"+ht.size());;
				return true;
			} else {
			    if (i ==  nums.length - k - 1) {
			        return false;
			    }
				ht.remove(nums[i]);
			}
		}
		return false;
	}
}
*/