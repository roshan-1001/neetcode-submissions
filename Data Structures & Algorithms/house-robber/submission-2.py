class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        cost = [0]*n
        if n == 0:
            return 0
        if n == 1:
            return nums[0]
        if n == 2:
            return max(nums[0],nums[1])
        cost[0] = nums[0]
        cost[1] = nums[1]
        cost[2] = nums[2] + cost[0]
        for i in range(3,n,1):
            cost[i] = nums[i] + max(cost[i-2],cost[i-3])
        
        return max(cost[n-2],cost[n-1])