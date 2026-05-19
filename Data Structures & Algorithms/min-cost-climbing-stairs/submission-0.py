class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        c = [0]*len(cost)
        n = len(cost)
        c[0]=cost[0]
        c[1]= cost[1]
        for i in range(2,n,1):
            c[i] = cost[i] + min(c[i-1],c[i-2])
        return min(c[n-1],c[n-2])