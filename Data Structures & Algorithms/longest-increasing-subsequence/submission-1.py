class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [1]*n
        #globalmin = dp[0]
        res = 1
        for i in range(n):
            for j in range(i+1,n):
                if nums[j]>nums[i]:
                    dp[j] = max(dp[j],1 + dp[i])
                    res = max(res,dp[j])
        return res