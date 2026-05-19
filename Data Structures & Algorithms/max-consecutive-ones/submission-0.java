class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int currmax = 0;
        int i = 0;
        int n = nums.length;
        while(i<n){
            while(i<n && nums[i]!=1){
                i++;
            }
            curr = 1;
            while(i<n && nums[i]==1){
                i++;
                curr++;
            }
            currmax = Math.max(currmax,curr-1);
        }
        return currmax;
    }
}