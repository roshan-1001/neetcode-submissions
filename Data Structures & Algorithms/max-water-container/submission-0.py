class Solution:
    def maxArea(self, heights: List[int]) -> int:
        j = len(heights)-1
        i = 0
        res = 0
        
        while(i<j):
            curr = min(heights[i],heights[j])*(j-i)
            res = max(res,curr)
            if heights[j]<heights[i]:
                j-=1
            else:
                i+=1

        return res
