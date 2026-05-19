class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        n = len(nums)
        t = target
        count = 0
        def dfs(i,currsum): 
            nonlocal count
            if currsum == target and i==n:
                count +=1
                return
            if i>=n:
                return
            dfs(i+1, currsum+nums[i])
            dfs(i+1, currsum-nums[i])
        
        dfs(0,0)
        return count
