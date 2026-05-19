class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        n = len(nums)
        s = sum(nums)
        if s%2==1:
            return False
        target = s/2
        def dfs(i,currsum):
            if i>=n or currsum>target:
                return False
            elif currsum==target:
                return True
            else:
                return dfs(i+1,currsum+nums[i]) or dfs(i+1,currsum)
        return dfs(0,0)
