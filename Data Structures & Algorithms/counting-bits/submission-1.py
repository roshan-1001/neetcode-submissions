class Solution:
    def countBits(self, n: int) -> List[int]:
        res = [1]*(n+1)
        res[0]=0
        x=1
        while(x):
            for i in range((2**x)+1,(2**(x+1))):
                if i>n:
                    x=0
                    break
                res[i]=res[i-2**x]+1
            if(not x):
                break
            x+=1
        return res