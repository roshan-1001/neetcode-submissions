class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        maxdp = [0]*n
        mindp = [0]*n
        maxdp[0] = nums[0]
        mindp[0] = nums[0]
        res=maxdp[0]
        for i in range(1,n):
            maxdp[i] = max(maxdp[i-1]*nums[i], nums[i], mindp[i-1]*nums[i])
            mindp[i] = min(maxdp[i-1]*nums[i], nums[i], mindp[i-1]*nums[i])
            res = max(res,maxdp[i])
        return res