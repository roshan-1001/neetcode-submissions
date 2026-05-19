class Solution:
    def canJump(self, nums: List[int]) -> bool:
        mp = {}
        mp[0] = 1
        n = len(nums)
        for i in range(n):
            if i in mp:
                for j in range(i+1,i+nums[i]+1):
                    mp[j] = 1
            else:
                return False
        return True