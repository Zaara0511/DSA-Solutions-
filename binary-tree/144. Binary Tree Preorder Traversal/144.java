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
    public void rev(TreeNode node, List<Integer> list){

        if(node==null){
            return;
        }
        list.add(node.val);

        rev(node.left,list);
        rev(node.right,list);

        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list= new ArrayList<>();

         rev(root, list);
         return list;
    }
}