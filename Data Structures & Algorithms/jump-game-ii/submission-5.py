class Solution:
    def jump(self, nums: List[int]) -> int:
        mp = {}
        n = len(nums)
        if n==1:
            return 0
        l = 0
        r = l + nums[l]
        count = 1
        currmax = r
        while(r<n-1):
            count+=1
            for i in range(l+1,r+1):
                currmax = max(currmax,i +nums[i])
            l=r
            r=currmax
        return count