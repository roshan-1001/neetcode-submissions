class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        

        if n<=3:
            cmax = 0
            for j in range(n):
                cmax = max(cmax,nums[j])
            return cmax
        c = [0]*n
        c[0] = nums[0]
        c[1] = nums[1]
        c[2] = nums[2] + c[0]

        for i in range(3,n-1,1):
            c[i] = nums[i]+max(c[i-2],c[i-3])
        currmax = max(c[n-2],c[n-3])
        
        d = [0]*n
        d[1] = nums[1]
        d[2] = nums[2]
        d[3] = nums[3] + d[1]
        for i in range(4,n,1):
            d[i] = nums[i] + max(d[i-2],d[i-3])
        
        currmax = max(currmax,d[n-1],d[n-2])
        return currmax