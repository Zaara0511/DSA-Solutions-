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
    public int rec(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=rec(root.left);
        int r=rec(root.right);

        if(l==-1){
            return -1;
        }
        if(r==-1){
            return -1;
        }
        if((int)Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int val= rec(root);

        if(val==-1) return false;

        return true;
    }
}