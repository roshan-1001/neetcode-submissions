class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        n = len(coins)
        coins.sort(reverse=True)
        res = float('inf')
        if amount == 0:
            return 0
        def knapsack(i,amt,freq):
            nonlocal res
            if freq > res:
                return
            if i>=n or amt>amount:
                return
            if amt == amount:
                res = min(res,freq)
                return
            
            knapsack(i,amt+coins[i],freq+1)
            knapsack(i+1,amt,freq)
        
        knapsack(0,0,0)
        if res!= float('inf'):
            return res
        else:
            return -1

        