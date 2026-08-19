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
    public void rec(TreeNode node,List<Integer> list ){
        if(node==null){
            return ;

        }
        rec(node.left,list);
        rec(node.right,list);
        list.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list= new ArrayList<>();

        rec(root,list);
         return list;
    }
}