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
    public int goodNodes(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int num = root.val;
        return 1+ count(root.left, num) + count(root.right, num);

    }

    private int count(TreeNode root, int num){
        if (root == null){
            return 0;
        }

        if (root.val >= num){
            return 1 + count(root.left,root.val) + count(root.right,root.val);
        }
        else{
            return count(root.left,num) + count(root.right,num);
        }
    }
}
