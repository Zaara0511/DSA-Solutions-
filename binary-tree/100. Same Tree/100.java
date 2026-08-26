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
    public boolean rec(TreeNode p, TreeNode q){
        //if both null-> sam level-> t
        // if not sam level->f
        // if diff val->f
        // rec(left) && rec(right)
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return rec(p.left,q.left) && rec(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return rec(p,q);
    }
}