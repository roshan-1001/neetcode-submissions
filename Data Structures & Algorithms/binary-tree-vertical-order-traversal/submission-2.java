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

public void dfs(TreeNode root, TreeMap<Integer,ArrayList<Integer>> tm, int curr){
    
    
    if (root == null){
        return;
    }
    
    if (tm.containsKey(curr)){
        tm.get(curr).add(root.val);
    }
    else{
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.val);
        tm.put(curr,arr);
    }
    dfs(root.left, tm, curr-1);
    dfs(root.right, tm, curr+1);
    return;
}

class Pair{
    TreeNode node;
    int col;

    public Pair(TreeNode node, int col){
        this.node = node;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();

        
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root,0));

        List<List<Integer>> res = new ArrayList<>();

        if (root==null){
            return res;
        }

        while(!q.isEmpty()){

            Pair curr = q.poll();
            
            if(curr.node.left!=null){
                Pair left = new Pair(curr.node.left, curr.col-1);
                q.offer(left);
            }

            if(curr.node.right!=null){
                Pair right = new Pair(curr.node.right, curr.col+1);
                q.offer(right);
            }

            if (tm.containsKey(curr.col)){
                tm.get(curr.col).add(curr.node.val);
            }
            else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(curr.node.val);
                tm.put(curr.col,arr);
            }
        }

        for(Map.Entry<Integer,ArrayList<Integer>> entry: tm.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}