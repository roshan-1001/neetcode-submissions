class Solution {
    public boolean search(int[] nums, int target) {
        int start = nums[0];
        int n = nums.length;
        int end = nums[n-1];

        if (target>=start){
            int j = 0;
            while(j<n && nums[j]<=target && nums[j]>=start){
                if(nums[j]==target){
                    return true;
                }
                j++;
            }
            return false;
        }
        else{
            int i = n-1;
            while(i>=0 && nums[i]>=target && nums[i]<=end ){
                if(nums[i]==target){
                    return true;
                }
                i--;
            }
            return false;
        }
    }
}