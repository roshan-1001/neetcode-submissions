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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if (root==null){
            return res;
        }
        q.add(root);

        while(!q.isEmpty()){
            int length = q.size();
            while(length>0){
                TreeNode node = q.poll();
                if(length == 1){
                    res.add(node.val);
                }
                length--;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }

        return res;
    }
}
