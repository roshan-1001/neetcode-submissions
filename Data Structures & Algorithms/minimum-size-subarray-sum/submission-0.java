class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currlen = 1;
        int n = nums.length;
        int res = n+1;
        int L = 0;
        int R = 0;
        int currtotal = nums[0];

        while(R<n && L<n){
            
            if (currtotal < target){
                R++;
                if(R<n){
                    currtotal += nums[R];
                }
            }
            else// (currtotal >= target)
            {
                res = Math.min(res,R-L+1);
                currtotal -= nums[L];
                L++;
            }
        }
        if (res==n+1){
            return 0;
        }
        return res;
    }
}