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
  public int minDepth(TreeNode root) {
 int depth=0;
 if(root==null)
     return depth;
 Queue<TreeNode> q=new LinkedList<TreeNode>();
 q.offer(root);
 while(q.peek()!=null){
     depth++;
     int size=q.size();
     for(int i=0;i<size;i++){
          TreeNode node=q.poll();
          if(node.left==null&&node.right==null)  
             return depth;
          if(node.left!=null)
             q.offer(node.left);
          if(node.right!=null)
             q.offer(node.right);
     }
    
 }
 return 0;
  }
 }
 /* My Solution, Why timeout?
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        root.val = 1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (q.peek() != null) {
            TreeNode node = q.poll();
            if(node.left != null) {
                node.left.val = node.val + 1;
                q.offer(root.left);
            }
            if(node.right != null) {
                node.right.val = node.val + 1;
                q.offer(root.right);
            }
            if(node.left == null && node.right == null) {
                return node.val;
            }
        }
        return -1;
    }
}*/

//(int) Math.round(Math.floor(Math.log10((double) count) / Math.log10((double) 2))) + 1;

