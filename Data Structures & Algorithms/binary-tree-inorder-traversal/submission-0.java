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
    private List<Integer> res = new ArrayList<>();
    public void addtores(TreeNode curr){
        if (curr != null){
            res.add(curr.val);
        }
        return;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return res;
        }
        inorderTraversal(root.left);
        addtores(root);
        inorderTraversal(root.right);

        return res;
    }
}