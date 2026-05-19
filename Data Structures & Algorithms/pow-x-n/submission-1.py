class Solution:
    def myPow(self, x: float, n: int) -> float:
        res = 1
        if n>0:
            while(n):
                res = res*x
                n-=1
        elif n<0:
            while(n):
                res = res*(1/x)
                n+=1
        return res