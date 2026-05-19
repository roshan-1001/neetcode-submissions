class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globmax = nums[0] ;
        int globmin = nums[0];
        int total = 0;
        int currmax = 0;
        int currmin = 0;

        for (int n : nums){
            currmax = Math.max(currmax+n,n);
            currmin = Math.min(currmin+n,n);
            total += n;
            globmax = Math.max(globmax,currmax);
            globmin = Math.min(globmin,currmin);
        }
        if (globmax<0){
            return globmax;
        }
        return Math.max(globmax,total-globmin);
    }
}