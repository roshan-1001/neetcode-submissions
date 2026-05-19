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
    
    public boolean isleaf(TreeNode root){
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null){
            return false;
        }

        if (isleaf(root)==true && targetSum==root.val){
            return true;
        }
        
        boolean l;
        boolean r;

        if(root.left!=null){
            l = hasPathSum(root.left, targetSum-root.val);
        }
        else{
            l = false;
        }
        if(root.right!=null){
            r = hasPathSum(root.right, targetSum-root.val);
        }
        else{
            r = false;
        }
        return (l || r);
        
        




    }
}