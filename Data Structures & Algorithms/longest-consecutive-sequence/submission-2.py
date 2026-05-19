class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()
        if len(nums)==0:
            return 0
        gmax=1
        maxi = 1
        for i in range(1,len(nums),1):
            if nums[i]==nums[i-1]:
                continue
            elif nums[i]-nums[i-1]==1:
                maxi+=1
            else:
                gmax=max(gmax,maxi)
                maxi=1
        gmax=max(gmax,maxi)
        return gmax