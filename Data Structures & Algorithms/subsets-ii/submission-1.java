class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> currset = new ArrayList<>();
        
        helper(0,nums,currset,subsets);
        
        return subsets;
    }

    public void helper(int i, int[] nums, List<Integer> currset, List<List<Integer>> subsets){
        if(i>=nums.length){
            subsets.add(new ArrayList<Integer>(currset));
            return;
        }
        currset.add(nums[i]);
        helper(i+1,nums, currset, subsets);
        currset.remove(currset.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        helper(i+1,nums,currset,subsets);
    }  
    
}
