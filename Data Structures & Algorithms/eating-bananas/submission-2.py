class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
            r = max(piles)
            res =r
            l = 1
            while l<=r:
                k = (l+r)//2
                totaltime = 0
                for p in piles:
                    totaltime += math.ceil(float(p)/k)
                if totaltime <=h:
                    res = k
                    r = k-1
                else:
                    l = k+1
            return res
