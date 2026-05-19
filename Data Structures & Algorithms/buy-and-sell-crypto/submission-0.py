class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        mintill = prices[0]
        curr = 0
        for i in range(1,n,1):
            mintill = min(prices[i-1],mintill)
            curr = max(curr,prices[i]-mintill)
        return curr