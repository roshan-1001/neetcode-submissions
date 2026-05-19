class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        lmax = [0]*n
        l = height[0]
        rmax = [0]*n
        r = height[n-1]
        for i in range(1,n,1):
            lmax[i] = max(height[i-1],l)
            l = max(height[i-1],l)
        for j in range(n-2,-1,-1):
            rmax[j] = max(height[j+1],r)
            r = max(height[j+1],r)
        ws = [0]*n
        for i in range(1,n-1,1):
            ws[i]=max(0,min(lmax[i],rmax[i])-height[i])
        res = sum(ws)
        print(lmax)
        print(rmax)
        print(ws)
        return res