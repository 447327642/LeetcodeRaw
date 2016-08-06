/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null) {
            return true;
        }
        
        /*
        if (q == null && p != null || p == null && q != null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        } if ((p.left == null && q.left != null || p.right == null && q.right != null )||( p.right != null && q.right == null || p.right != null && q.right == null)) {
            return false;
        } if (p.left == null && q.left == null && p.right == null && q.right == null && p.val == q.val) {
            return true;
        } */ 
        if (q == null || p == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
