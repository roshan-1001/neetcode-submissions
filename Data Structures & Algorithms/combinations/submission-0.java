class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(1,0,n,k,curr,res);
        return res;
    }

    public void helper(int i, int count, int n, int k, List<Integer> curr, List<List<Integer>> res){
        
        if(count==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i>n || count>k){
            return;
        }

        curr.add(i);
        helper(i+1,count+1,n,k,curr,res);
        curr.remove(curr.size()-1);
        helper(i+1,count,n,k,curr,res);
        
    }

}