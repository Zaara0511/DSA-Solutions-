/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=0;
    public void rec(TreeNode root, int depth){
        
        if(root==null){
            return;
        }
        depth++;
        max=Math.max(depth,max);
        rec(root.left,depth);
        rec(root.right,depth);

    }
    public int maxDepth(TreeNode root) {
        rec(root,0);
        return max;
    }
}