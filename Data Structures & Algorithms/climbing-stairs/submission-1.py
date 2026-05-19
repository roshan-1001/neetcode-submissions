class Solution:
    def climbStairs(self, n: int) -> int:
        arr = [0]*n
        if n <=2:
            return n
        arr[1] = 2    
        arr[0] = 1
        for i in range(2,n,1):
            arr[i] = arr[i-2] + arr[i-1]
        return arr[n-1]